package com.ejemplo.dao;


import com.ejemplo.paquete.dto.UsuarioWeb;

public class UsuarioWebDAO {

	


	public void RegistrarUsuarioWeb(UsuarioWeb uw){
		String tiraSQL= "INSERT INTO tb_usuario_web(cedula,nombre,apellido,correo,telefono,codigo_ciudad,sexo) "
				+ "VALUES ('"+uw.getCedula()+"'"+",'"+ uw.getNombre()+"','"+ uw.getApellido()+"'"
						+ ",'"+ uw.getCorreo()+"','"+ uw.getTelefono()+"','"+ uw.getCiudad()+"','"+ uw.getSexo()+"')";
		Conexion.ejecutar(tiraSQL);
		
		System.out.println("registro un usuWeb");
	
}
}