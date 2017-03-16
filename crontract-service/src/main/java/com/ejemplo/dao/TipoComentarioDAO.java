package com.ejemplo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.ejemplo.paquete.dto.Ciudad;
import com.ejemplo.paquete.dto.TipoComentario;

public class TipoComentarioDAO {

	public LinkedList<TipoComentario> ObtenerTipoComentario(){
		String tiraSQL = "SELECT * FROM tb_tipo_comentario where status='Activo'";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<TipoComentario> listaTipoComentario= new LinkedList<TipoComentario>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaTipoComentario.add(new TipoComentario(resultSet.getString("codigo"),
					resultSet.getString("descripcion"),
					resultSet.getString("status")
					));
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaTipoComentario;
	}
	
	
	
}
