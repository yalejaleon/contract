package com.ejemplo.paquete.dto;

public class Organizacion {

	String mision,vision;

	public Organizacion(String mision, String vision) {
		super();
		this.mision = mision;
		this.vision = vision;
	}

	public String getMision() {
		return mision;
	}

	public void setMision(String mision) {
		this.mision = mision;
	}

	public String getVision() {
		return vision;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}
	
	
}
