package com.ejemplo.paquete.dto;

public class Cita {

	
	String codigo,codigo_detalle_solicitud,codigo_agenda,status,fecha;

	public Cita(String codigo, String codigo_detalle_solicitud, String codigo_agenda, String status, String fecha) {
		super();
		this.codigo = codigo;
		this.codigo_detalle_solicitud = codigo_detalle_solicitud;
		this.codigo_agenda = codigo_agenda;
		this.status = status;
		this.fecha = fecha;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo_detalle_solicitud() {
		return codigo_detalle_solicitud;
	}

	public void setCodigo_detalle_solicitud(String codigo_detalle_solcitud) {
		this.codigo_detalle_solicitud = codigo_detalle_solcitud;
	}

	public String getCodigo_agenda() {
		return codigo_agenda;
	}

	public void setCodigo_agenda(String codigo_agenda) {
		this.codigo_agenda = codigo_agenda;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
