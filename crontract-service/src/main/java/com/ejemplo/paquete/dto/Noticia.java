package com.ejemplo.paquete.dto;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("contracts")
public class Noticia {

	public String codigo, status, codigo_sistema, tipo_noticia, Titulo,contenido,imagen;
	public Date fecha;
	
	public Noticia(String codigo, String status, String codigo_sistema, String tipo_noticia, String titulo,
			String contenido, String imagen, Date fecha) {
		super();
		this.codigo = codigo;
		this.status = status;
		this.codigo_sistema = codigo_sistema;
		this.tipo_noticia = tipo_noticia;
		Titulo = titulo;
		this.contenido = contenido;
		this.imagen = imagen;
		this.fecha = fecha;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public String getCodigo_sistema() {
		return codigo_sistema;
	}

	public void setCodigo_sistema(String codigo_sistema) {
		this.codigo_sistema = codigo_sistema;
	}

	public String getTipo_noticia() {
		return tipo_noticia;
	}

	public void setTipo_noticia(String tipo_noticia) {
		this.tipo_noticia = tipo_noticia;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contract [codigo=").append(codigo).append(", status=")
		.append(status).append(", codigo_sistema=").append(codigo_sistema).append(", tipo_noticia=").append(tipo_noticia)
		.append(", Titulo=").append(Titulo).append(", contenido=").append(contenido)
		.append(", imagen=").append(imagen).append(", fecha=").append(fecha).append("]");
		return builder.toString();
	}
}
