package com.ejemplo.dao;

import com.ejemplo.paquete.dto.DetalleSolicitud;

public class DetalleSolicitudDAO {

	
	
	public void RegistrarDetalle(DetalleSolicitud ds){
		String tiraSQL= "INSERT INTO tb_detalle_solicitud (codigo_solicitud, codigo_paquete,codigo_servicio,codigo,status) "
				+ "VALUES ('"+ds.getCodigo_solicitud()+"'"+",'"+ ds.getCodigo_paquete()+"','"+ ds.getCodigo_servicio()+"'"
						+ ",'"+ ds.getCodigo()+"','"+ ds.getStatus()+"')";
		Conexion.ejecutar(tiraSQL);
	}
	
}
