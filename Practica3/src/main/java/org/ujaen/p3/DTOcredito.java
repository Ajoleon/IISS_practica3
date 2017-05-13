package org.ujaen.p3;

public class DTOcredito {
	private String matricula;
	private double credito;
	
	
	public DTOcredito() {
		this.matricula="";
		this.credito = 0;
	}


	public DTOcredito(String matricula, double credito) {
		this.matricula = matricula;
		this.credito = credito;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double getCredito() {
		return credito;
	}


	public void setCredito(double credito) {
		this.credito = credito;
	}
	
}