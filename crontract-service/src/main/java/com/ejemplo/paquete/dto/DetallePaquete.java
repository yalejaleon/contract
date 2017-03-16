package com.ejemplo.paquete.dto;

public class DetallePaquete {

	String tipo_paquete, titulo, descripcion, imagen;

	public DetallePaquete(String tipo_paquete, String titulo, String descripcion, String imagen) {
		super();
		this.tipo_paquete = tipo_paquete;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.imagen = imagen;
	}

	public String getTipo_paquete() {
		return tipo_paquete;
	}

	public void setTipo_paquete(String tipo_paquete) {
		this.tipo_paquete = tipo_paquete;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
	
}
