package com.ejemplo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.ejemplo.paquete.dto.Ciudad;


public class CiudadDAO {

	//codigo,descripcion,estado,status
	

	public LinkedList<Ciudad> ObtenerCiudad(){
		String tiraSQL = "SELECT * FROM tb_ciudad";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<Ciudad> listaCiudad= new LinkedList<Ciudad>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaCiudad.add(new Ciudad(resultSet.getString("codigo"),
					resultSet.getString("descripcion"),
					resultSet.getString("estado"),
					resultSet.getString("status")
					));
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaCiudad;
	}
	
	public LinkedList<Ciudad> ObtenerUnaCiudad(String codigo){
		String tiraSQL = "select c.* from tb_ciudad c, tb_estado e where c.estado=e.codigo and e.codigo='"+codigo+"' ";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<Ciudad> listaCiudad= new LinkedList<Ciudad>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaCiudad.add(new Ciudad(resultSet.getString("codigo"),
					resultSet.getString("descripcion"),
					resultSet.getString("estado"),
					resultSet.getString("status")
					));
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaCiudad;
	}
	
}
