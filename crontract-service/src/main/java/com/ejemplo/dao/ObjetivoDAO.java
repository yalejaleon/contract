package com.ejemplo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;


import com.ejemplo.paquete.dto.Objetivo;

public class ObjetivoDAO {

	
	public LinkedList<Objetivo> ObtenerObjetivo(){
		String tiraSQL = "SELECT * FROM tb_objetivo where status='Activo'";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<Objetivo> listaObjetivo= new LinkedList<Objetivo>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaObjetivo.add(new Objetivo(resultSet.getString("codigo"),
					resultSet.getString("descripcion")
					
					));
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaObjetivo;
	}
	
}
