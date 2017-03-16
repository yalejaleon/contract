package com.ejemplo.paquete.dto;

public class Ocupacion {
	
	
	String codigo,descripcion, status;

	public Ocupacion(String codigo, String descripcion, String status) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.status = status;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contract [codigo=").append(codigo).append(", descripcion=")
		.append(descripcion).append(", status=").append(status).append("]");
		return builder.toString();
	}
	
}
