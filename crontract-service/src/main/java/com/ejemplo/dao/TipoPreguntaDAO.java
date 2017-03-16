package com.ejemplo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.ejemplo.paquete.dto.TipoPregunta;

public class TipoPreguntaDAO {

	
	public LinkedList<TipoPregunta> ObtenerTipoPregunta(){
		String tiraSQL = "SELECT * FROM tb_tipo_pregunta where status='Activo'";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<TipoPregunta> listaTipoPregunta= new LinkedList<TipoPregunta>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaTipoPregunta.add(new TipoPregunta(resultSet.getString("codigo"),
					resultSet.getString("descripcion"),
					resultSet.getString("status")
					));		
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaTipoPregunta;
	}
	
}
