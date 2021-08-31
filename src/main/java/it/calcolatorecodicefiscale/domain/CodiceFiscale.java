package it.calcolatorecodicefiscale.domain;

public class CodiceFiscale {

	private String codiceFiscale;
	private Persona persona;

	public CodiceFiscale() {

	}

	public CodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Persona getPersona() {
		return persona;
	}

}
