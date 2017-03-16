package com.ejemplo.dao;

import com.ejemplo.paquete.dto.Solicitud;

public class SolicitudDAO {


	public void RegistrarSolicitud(Solicitud s){
		String tiraSQL= "INSERT INTO tb_solicitud (codigo, codigo_cliente,status,fecha) "
				+ "VALUES ('"+s.getCodigo()+"'"+",'"+ s.getCodigo_cliente()+"','"+ s.getStatus()+"'"
						+ ",'"+ s.getFecha()+"')";
		Conexion.ejecutar(tiraSQL);
	}
	
	
	
}
