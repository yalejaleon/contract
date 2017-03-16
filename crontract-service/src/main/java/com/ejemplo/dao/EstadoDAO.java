package com.ejemplo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.ejemplo.paquete.dto.Estado;


public class EstadoDAO {

	
	public LinkedList<Estado> ObtenerEstados(){
		String tiraSQL = "SELECT * FROM tb_estado";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<Estado> listaEstado= new LinkedList<Estado>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaEstado.add(new Estado(resultSet.getString("codigo"),
					resultSet.getString("descripcion"),
					resultSet.getString("status")
					));
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaEstado;
	}
	
}
