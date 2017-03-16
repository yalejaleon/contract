package com.ejemplo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.ejemplo.paquete.dto.Referido;


public class ReferidoDAO {

	
	public LinkedList<Referido> ObtenerReferido(){
		String tiraSQL = "SELECT * FROM tb_referencia";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<Referido> listaReferencia= new LinkedList<Referido>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaReferencia.add(new Referido(resultSet.getString("codigo"),
					resultSet.getString("descripcion"),
					resultSet.getString("status")
					));
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaReferencia;
	}
}
