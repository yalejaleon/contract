package com.ejemplo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.ejemplo.paquete.dto.ServicioGeneral;

public class ServicioGeneralDAO {

	public LinkedList<ServicioGeneral> ObtenerServicioGeneral(){
		String tiraSQL = "SELECT * FROM tb_tipo_servicio where status='Activo'";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<ServicioGeneral> listaServicioGeneral= new LinkedList<ServicioGeneral>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaServicioGeneral.add(new ServicioGeneral(resultSet.getString("codigo"),
					resultSet.getString("descripcion"),
					resultSet.getString("status"),
					resultSet.getString("imagen")
					));
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaServicioGeneral;
	}
	
}
