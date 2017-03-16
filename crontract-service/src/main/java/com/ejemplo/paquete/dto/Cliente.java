package com.ejemplo.paquete.dto;

public class Cliente {

String	cedula,
	  	nombre ,
	  	apellido,
	  	correo ,
	  	telefono,
	  	ciudad ,
		codigo_acuerdo ;

public Cliente(String cedula, String nombre, String apellido, String telefono,
		 String correo, String ciudad, String codigo_acuerdo) {
	super();
	this.cedula = cedula;
	this.nombre = nombre;
	this.apellido = apellido;
	this.telefono = telefono;
	this.correo = correo;
	this.ciudad = ciudad;
	this.codigo_acuerdo = codigo_acuerdo;
	
}


public String getCedula() {
	return cedula;
}


public void setCedula(String cedula) {
	this.cedula = cedula;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getApellido() {
	return apellido;
}


public void setApellido(String apellido) {
	this.apellido = apellido;
}


public String getTelefono() {
	return telefono;
}


public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getCorreo() {
	return correo;
}


public void setCorreo(String correo) {
	this.correo = correo;
}


public String getCiudad() {
	return ciudad;
}


public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}


public String getCodigo_acuerdo() {
	return codigo_acuerdo;
}


public void setCodigo_acuerdo(String codigo_acuerdo) {
	this.codigo_acuerdo = codigo_acuerdo;
}


@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Contract [cedula=").append(cedula).append(", nombre=").append(nombre)
	.append(", apellido=").append(apellido).append(", telefono=").append(telefono).append(", correo=").append(correo)
	.append(", ciudad =").append(ciudad).append(", codigo_acuerdo=").append(codigo_acuerdo)
	.append("]");
	return builder.toString();
}

	
}
