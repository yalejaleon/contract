package com.ejemplo.paquete.dto;

public class Usuario {

	String usuario,contrasenna,rol,status,codigo;

	public Usuario(String usuario, String contrasenna, String rol, String status, String codigo) {
		super();
		this.usuario = usuario;
		this.contrasenna = contrasenna;
		this.rol = rol;
		this.status = status;
		this.codigo = codigo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenna() {
		return contrasenna;
	}

	public void setContrasenna(String contrasenna) {
		this.contrasenna = contrasenna;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	} 
	
	
}
