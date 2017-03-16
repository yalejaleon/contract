package com.ejemplo.dao;

import com.ejemplo.paquete.dto.Cita;


public class CitaDAO {


	public void RegistrarCita(Cita c){
		String tiraSQL= "INSERT INTO tb_cita (codigo,codigo_detalle_solicitud,codigo_agenda,status,fecha) "
				+ "VALUES ('"+c.getCodigo()+"'"+",'"+ c.getCodigo_detalle_solicitud()+"','"+ c.getCodigo_agenda()+"'"
						+ ",'"+ c.getStatus()+"','"+ c.getFecha()+"')";
		Conexion.ejecutar(tiraSQL);
	
	
	
	}
}
