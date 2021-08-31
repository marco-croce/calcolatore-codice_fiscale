package it.calcolatorecodicefiscale.business;

import java.time.LocalDate;

import it.calcolatorecodicefiscale.domain.Persona;
import it.calcolatorecodicefiscale.domain.Sesso;

public class CodiceFiscaleService {

	private ComuneService comuneService;
	private StatoEsteroService statoEsteroService;

	private String codiceFiscaleParziale;

	public CodiceFiscaleService() {
		codiceFiscaleParziale = "";
		comuneService = new ComuneService();
		statoEsteroService = new StatoEsteroService();
	}

	private String cancellaSpazi(String codiceFiscaleParziale) {
		return cancellaSpazi(codiceFiscaleParziale, 0, codiceFiscaleParziale.length());
	}

	private String cancellaSpazi(String codiceFiscaleParziale, int indice, int lunghezza) {
		if (indice == lunghezza)
			return codiceFiscaleParziale;
		if (Character.isWhitespace(codiceFiscaleParziale.charAt(indice))) {
			codiceFiscaleParziale = codiceFiscaleParziale.substring(0, indice)
					+ codiceFiscaleParziale.substring(indice + 1);
			lunghezza = codiceFiscaleParziale.length();
		}
		return cancellaSpazi(codiceFiscaleParziale, indice + 1, lunghezza);
	}

	private boolean isVocale(char lettera) {
		if (lettera == 'A' || lettera == 'E' || lettera == 'I' || lettera == 'O' || lettera == 'U')
			return true;
		else
			return false;
	}

	private boolean isConsonante(char lettera) {
		return !(isVocale(lettera));
	}

	private void aggiungiCaratteriCognome(String cognome) {

		cognome = cancellaSpazi(cognome);

		int i, caratteriInseriti;

		for (i = 0, caratteriInseriti = 0; i < cognome.length() && caratteriInseriti != 3; i++) {
			if (isConsonante(cognome.charAt(i))) {
				codiceFiscaleParziale += String.valueOf(cognome.charAt(i));
				caratteriInseriti++;
			}
		}

		if (caratteriInseriti != 3) {
			for (i = 0; i < cognome.length() && caratteriInseriti != 3; i++) {
				if (isVocale(cognome.charAt(i))) {
					codiceFiscaleParziale += String.valueOf(cognome.charAt(i));
					caratteriInseriti++;
				}
			}
		}

		if (caratteriInseriti != 3) {
			for (i = 0; i < (3 - caratteriInseriti); i++) {
				codiceFiscaleParziale += "X";
			}
		}

	}

	private void aggiungiCaratteriNome(String nome) {

		nome = cancellaSpazi(nome);

		int i, caratteriInseriti, numeroConsonanti = 0;

		for (i = 0; i < nome.length(); i++) {
			if (isConsonante(nome.charAt(i)))
				numeroConsonanti++;
		}

		if (numeroConsonanti >= 4) {

			for (i = 0, caratteriInseriti = 0, numeroConsonanti = 0; i < nome.length() && caratteriInseriti != 3; i++) {
				if (isConsonante(nome.charAt(i))) {
					numeroConsonanti++;
					if (numeroConsonanti != 2) {
						caratteriInseriti++;
						codiceFiscaleParziale += String.valueOf(nome.charAt(i));
					}
				}
			}

			if (caratteriInseriti != 3) {
				for (i = 0; i < nome.length() && caratteriInseriti != 3; i++) {
					if (isVocale(nome.charAt(i))) {
						codiceFiscaleParziale += String.valueOf(nome.charAt(i));
						caratteriInseriti++;
					}
				}
			}

			if (caratteriInseriti != 3) {
				for (i = 0; i < (3 - caratteriInseriti); i++) {
					codiceFiscaleParziale += "X";
				}
			}

		} else {
			aggiungiCaratteriCognome(nome);
		}

	}

	private void aggiungiNumeriAnno(LocalDate dataNascita) {
		int annoNascita = dataNascita.getYear();

		codiceFiscaleParziale += String.valueOf(String.valueOf(annoNascita).charAt(2));
		codiceFiscaleParziale += String.valueOf(String.valueOf(annoNascita).charAt(3));
	}

	private void aggiungiCarattereMese(LocalDate dataNascita) {
		int meseNascita = dataNascita.getMonthValue();

		switch (meseNascita) {
		case 1:
			codiceFiscaleParziale += "A";
			break;
		case 2:
			codiceFiscaleParziale += "B";
			break;
		case 3:
			codiceFiscaleParziale += "C";
			break;
		case 4:
			codiceFiscaleParziale += "D";
			break;
		case 5:
			codiceFiscaleParziale += "E";
			break;
		case 6:
			codiceFiscaleParziale += "H";
			break;
		case 7:
			codiceFiscaleParziale += "L";
			break;
		case 8:
			codiceFiscaleParziale += "M";
			break;
		case 9:
			codiceFiscaleParziale += "P";
			break;
		case 10:
			codiceFiscaleParziale += "R";
			break;
		case 11:
			codiceFiscaleParziale += "S";
			break;
		case 12:
			codiceFiscaleParziale += "T";
			break;
		}

	}

	private void aggiungiNumeriGiorno(LocalDate dataNascita, Sesso sesso) {
		int giornoNascita = dataNascita.getDayOfMonth();

		if (sesso == Sesso.DONNA)
			giornoNascita += 40;

		if (giornoNascita > 9)
			codiceFiscaleParziale += String.valueOf(giornoNascita);
		else
			codiceFiscaleParziale += 0 + String.valueOf(giornoNascita);
	}

	private void aggiungiCarattereControllo() {

		int n = calcolaCarattereControllo();

		switch (n % 26) {

		case 0:
			codiceFiscaleParziale += "A";
			break;
		case 1:
			codiceFiscaleParziale += "B";
			break;
		case 2:
			codiceFiscaleParziale += "C";
			break;
		case 3:
			codiceFiscaleParziale += "D";
			break;
		case 4:
			codiceFiscaleParziale += "E";
			break;
		case 5:
			codiceFiscaleParziale += "F";
			break;
		case 6:
			codiceFiscaleParziale += "G";
			break;
		case 7:
			codiceFiscaleParziale += "H";
			break;
		case 8:
			codiceFiscaleParziale += "I";
			break;
		case 9:
			codiceFiscaleParziale += "J";
			break;
		case 10:
			codiceFiscaleParziale += "K";
			break;
		case 11:
			codiceFiscaleParziale += "L";
			break;
		case 12:
			codiceFiscaleParziale += "M";
			break;
		case 13:
			codiceFiscaleParziale += "N";
			break;
		case 14:
			codiceFiscaleParziale += "O";
			break;
		case 15:
			codiceFiscaleParziale += "P";
			break;
		case 16:
			codiceFiscaleParziale += "Q";
			break;
		case 17:
			codiceFiscaleParziale += "R";
			break;
		case 18:
			codiceFiscaleParziale += "S";
			break;
		case 19:
			codiceFiscaleParziale += "T";
			break;
		case 20:
			codiceFiscaleParziale += "U";
			break;
		case 21:
			codiceFiscaleParziale += "V";
			break;
		case 22:
			codiceFiscaleParziale += "W";
			break;
		case 23:
			codiceFiscaleParziale += "X";
			break;
		case 24:
			codiceFiscaleParziale += "Y";
			break;
		case 25:
			codiceFiscaleParziale += "Z";
			break;
		}

	}

	private int calcolaCarattereControllo() {

		int i = 0;
		int n = 0;

		while (i < codiceFiscaleParziale.length()) {

			i++;

			if (i % 2 == 0) {
				switch (codiceFiscaleParziale.charAt(i - 1)) {

				case 'A':
				case '0':
					n += 0;
					break;
				case 'B':
				case '1':
					n += 1;
					break;
				case 'C':
				case '2':
					n += 2;
					break;
				case 'D':
				case '3':
					n += 3;
					break;
				case 'E':
				case '4':
					n += 4;
					break;
				case 'F':
				case '5':
					n += 5;
					break;
				case 'G':
				case '6':
					n += 6;
					break;
				case 'H':
				case '7':
					n += 7;
					break;
				case 'I':
				case '8':
					n += 8;
					break;
				case 'J':
				case '9':
					n += 9;
					break;
				case 'K':
					n += 10;
					break;
				case 'L':
					n += 11;
					break;
				case 'M':
					n += 12;
					break;
				case 'N':
					n += 13;
					break;
				case 'O':
					n += 14;
					break;
				case 'P':
					n += 15;
					break;
				case 'Q':
					n += 16;
					break;
				case 'R':
					n += 17;
					break;
				case 'n':
					n += 18;
					break;
				case 'T':
					n += 19;
					break;
				case 'U':
					n += 20;
					break;
				case 'V':
					n += 21;
					break;
				case 'W':
					n += 22;
					break;
				case 'X':
					n += 23;
					break;
				case 'Y':
					n += 24;
					break;
				case 'Z':
					n += 25;
					break;
				}
			} else {
				switch (codiceFiscaleParziale.charAt(i - 1)) {
				case 'A':
				case '0':
					n += 1;
					break;
				case 'B':
				case '1':
					n += 0;
					break;
				case 'C':
				case '2':
					n += 5;
					break;
				case 'D':
				case '3':
					n += 7;
					break;
				case 'E':
				case '4':
					n += 9;
					break;
				case 'F':
				case '5':
					n += 13;
					break;
				case 'G':
				case '6':
					n += 15;
					break;
				case 'H':
				case '7':
					n += 17;
					break;
				case 'I':
				case '8':
					n += 19;
					break;
				case 'J':
				case '9':
					n += 21;
					break;
				case 'K':
					n += 2;
					break;
				case 'L':
					n += 4;
					break;
				case 'M':
					n += 18;
					break;
				case 'N':
					n += 20;
					break;
				case 'O':
					n += 11;
					break;
				case 'P':
					n += 3;
					break;
				case 'Q':
					n += 6;
					break;
				case 'R':
					n += 8;
					break;
				case 'S':
					n += 12;
					break;
				case 'T':
					n += 14;
					break;
				case 'U':
					n += 16;
					break;
				case 'V':
					n += 10;
					break;
				case 'W':
					n += 22;
					break;
				case 'X':
					n += 25;
					break;
				case 'Y':
					n += 24;
					break;
				case 'Z':
					n += 23;
					break;
				}
			}
		}

		return n;
	}

	public String calcolaCodiceFiscale(Persona persona) {

		aggiungiCaratteriCognome(persona.getCognome());
		aggiungiCaratteriNome(persona.getNome());
		aggiungiNumeriAnno(persona.getDataNascita());
		aggiungiCarattereMese(persona.getDataNascita());
		aggiungiNumeriGiorno(persona.getDataNascita(), persona.getSesso());

		if (persona.getComune().getNome() != null) {
			try {
				codiceFiscaleParziale += comuneService.codiceComune(persona.getComune().getNome());
			} catch (CodiceNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			try {
				codiceFiscaleParziale += statoEsteroService.codiceStatoEstero(persona.getComune().getNome());
			} catch (CodiceNotFoundException e) {
				e.printStackTrace();
			}
		}

		aggiungiCarattereControllo();

		return codiceFiscaleParziale;

	}

}
