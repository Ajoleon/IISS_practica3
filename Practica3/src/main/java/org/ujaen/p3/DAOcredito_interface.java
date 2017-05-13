package org.ujaen.p3;

public interface DAOcredito_interface {
	public DTOcredito nuevo(DTOcredito coche);
	public double disponible(String matricula);
	public DTOcredito resta(String matricula, double dinero);
	public DTOcredito suma(String matricula, double dinero);
}
