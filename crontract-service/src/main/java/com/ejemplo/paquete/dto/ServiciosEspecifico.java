package com.ejemplo.paquete.dto;

public class ServiciosEspecifico {

	String codigo,titulo,imagen;
	double precio;

	public ServiciosEspecifico(String codigo, String titulo, String imagen, double precio) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.imagen = imagen;
		this.precio= precio;
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
	
	
}
