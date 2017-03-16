package com.ejemplo.paquete.dto;


import java.sql.Timestamp;

public class Comentario {

	
	String tipo_comentario,codigo,descripcion,codigo_usuario,status,codigo_usuario_web,clase_comentario;
	Timestamp fecha;
	public Comentario(String tipo_comentario, String codigo, String descripcion, String codigo_usuario, String status,
			String codigo_usuario_web, String clase_comentario, Timestamp fecha) {
		super();
		this.tipo_comentario = tipo_comentario;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.codigo_usuario = codigo_usuario;
		this.status = status;
		this.codigo_usuario_web = codigo_usuario_web;
		this.clase_comentario = clase_comentario;
		this.fecha = fecha;
	}
	public String getTipo_comentario() {
		return tipo_comentario;
	}
	public void setTipo_comentario(String tipo_comentario) {
		this.tipo_comentario = tipo_comentario;
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
	public String getCodigo_usuario() {
		return codigo_usuario;
	}
	public void setCodigo_usuario(String codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCodigo_usuario_web() {
		return codigo_usuario_web;
	}
	public void setCodigo_usuario_web(String codigo_usuario_web) {
		this.codigo_usuario_web = codigo_usuario_web;
	}
	public String getClase_comentario() {
		return clase_comentario;
	}
	public void setClase_comentario(String clase_comentario) {
		this.clase_comentario = clase_comentario;
	}
	public Timestamp getFecha() {
		return fecha;
	}
	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	
	
}
