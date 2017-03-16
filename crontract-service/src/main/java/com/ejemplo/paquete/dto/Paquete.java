package com.ejemplo.paquete.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("contracts")
public class Paquete {

	
	public String codigo,descripcion,tipo_paquete,status,imagen;
	public Double precio;
	
	
	
	public Paquete(String codigo, String descripcion, String tipo_paquete, String status, String imagen,
			Double precio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.tipo_paquete = tipo_paquete;
		this.status = status;
		this.imagen = imagen;
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



	public String getTipo_paquete() {
		return tipo_paquete;
	}



	public void setTipo_paquete(String tipo_paquete) {
		this.tipo_paquete = tipo_paquete;
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



	public Double getPrecio() {
		return precio;
	}



	public void setPrecio(Double precio) {
		this.precio = precio;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contract [codigo=").append(codigo).append(", descripcion=").append(descripcion).append(", tipo_paquete=")
				.append(tipo_paquete).append(", status=").append(status).append(", imagen=").append(imagen).append("]");
		return builder.toString();
	}
	
	
	
	
	
}
