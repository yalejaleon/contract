package com.ejemplo.paquete.dto;

public class ServicioGeneral {

	String codigo,descripcion,status,imagen;

	public ServicioGeneral(String codigo, String descripcion, String status, String imagen) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.status = status;
		this.imagen = imagen;
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

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
	
}
