package com.ejemplo.paquete.dto;

public class Servicio {

	public String codigo, descripcion,tipo_servicio ,codigo_organizacion,imagen ,titulo;
	double precio;
	public Servicio(String codigo, String descripcion, String tipo_servicio, String codigo_organizacion, String imagen,
			String titulo, double precio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.tipo_servicio = tipo_servicio;
		this.codigo_organizacion = codigo_organizacion;
		this.imagen = imagen;
		this.titulo = titulo;
		this.precio = precio;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo_servicio() {
		return tipo_servicio;
	}

	public void setTipo_servicio(String tipo_servicio) {
		this.tipo_servicio = tipo_servicio;
	}

	public String getCodigo_organizacion() {
		return codigo_organizacion;
	}

	public void setCodigo_organizacion(String codigo_organizacion) {
		this.codigo_organizacion = codigo_organizacion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
	
}
