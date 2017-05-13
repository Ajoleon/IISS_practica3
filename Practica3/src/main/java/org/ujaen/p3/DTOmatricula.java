package org.ujaen.p3;

import java.io.Serializable;
import java.util.Date;

public class DTOmatricula implements Serializable{
	
	private int parkingId;
	private String matricula;
	private Date fecha;
	
	public int getParkingId() {
		return parkingId;
	}
	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public DTOmatricula(int parkingId, String matricula) {
		
		this.parkingId = parkingId;
		this.matricula = matricula;
	}
	public DTOmatricula() {
		this.parkingId = 0;
		this.matricula = "";
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
