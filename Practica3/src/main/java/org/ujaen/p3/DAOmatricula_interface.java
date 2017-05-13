package org.ujaen.p3;

public interface DAOmatricula_interface {
	public void entrada(DTOmatricula matricula);
	public void salida(DTOmatricula matricula);
	public DTOmatricula obtener(String matricula);

}
