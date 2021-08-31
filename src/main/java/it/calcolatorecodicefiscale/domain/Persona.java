package it.calcolatorecodicefiscale.domain;

import java.time.LocalDate;

public class Persona {

	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	private Comune comune;
	private StatoEstero statoEstero;
	private Sesso sesso;
	private CodiceFiscale codiceFiscale;

	public Persona() {

	}

	public Persona(String nome, String cognome, LocalDate dataNascita, String luogoNascita, String statoEsteroNascita,
			Sesso sesso) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		if (luogoNascita != null)
			comune = new Comune(luogoNascita);
		if (statoEsteroNascita != null)
			statoEstero = new StatoEstero(statoEsteroNascita);
		this.sesso = sesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Comune getComune() {
		return comune;
	}

	public void setComune(Comune comune) {
		this.comune = comune;
	}

	public StatoEstero getStatoEstero() {
		return statoEstero;
	}

	public void setStatoEstero(StatoEstero statoEstero) {
		this.statoEstero = statoEstero;
	}

	public Sesso getSesso() {
		return sesso;
	}

	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}

	public CodiceFiscale getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(CodiceFiscale codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

}
