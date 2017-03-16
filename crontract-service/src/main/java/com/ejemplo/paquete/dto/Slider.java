package com.ejemplo.paquete.dto;

public class Slider {

	String codigo,titulo,leer_mas,status,subtitulo,codigo_sistema,imagen;
	
	public Slider(String codigo,String titulo,String leer_mas,String status,String subtitulo,String codigo_sistema, String imagen){
		this.codigo=codigo;
		this.titulo=titulo;
		this.leer_mas=leer_mas;
		this.status=status;
		this.subtitulo=subtitulo;
		this.codigo_sistema=codigo_sistema;
		this.imagen=imagen;
	}

	
	
	public String getImagen() {
		return imagen;
	}



	public void setImagen(String imagen) {
		this.imagen = imagen;
	}



	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLeer_mas() {
		return leer_mas;
	}

	public void setLeer_mas(String leer_mas) {
		this.leer_mas = leer_mas;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}

	public String getCodigo_sistema() {
		return codigo_sistema;
	}

	public void setCodigo_sistema(String codigo_sistema) {
		this.codigo_sistema = codigo_sistema;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contract [codigo=").append(codigo).append(", titulo=").append(titulo).
		append(", leer_mas=").append(leer_mas).append(", status=").append(status)
		.append(", subtitulo=").append(subtitulo).append(", codigo_sistema=").append(codigo_sistema).append("]");
		return builder.toString();
	}
}
