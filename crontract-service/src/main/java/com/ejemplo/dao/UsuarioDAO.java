package com.ejemplo.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.ejemplo.dao.Conexion;

import com.ejemplo.paquete.dto.Usuario;

public class UsuarioDAO {

	
	public LinkedList<Usuario> ObtenerUsuario(){
		String tiraSQL = "SELECT * FROM tb_usuario";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<Usuario> listaUsuario= new LinkedList<Usuario>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaUsuario.add(new Usuario(resultSet.getString("usuario"),
					resultSet.getString("contrasenna"),
					resultSet.getString("rol"),
					resultSet.getString("status"),
					resultSet.getString("codigo")
					));
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaUsuario;
	}
	
	public Usuario ObtenerUnUsuario(String usuario, String contrasenna){
		String tiraSQL = "SELECT * FROM tb_usuario where usuario='"+usuario+"' and contrasenna='"+contrasenna+"'";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		Usuario UnUsuario= null;
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					UnUsuario= new Usuario(resultSet.getString("usuario"),
					resultSet.getString("contrasenna"),
					resultSet.getString("rol"),
					resultSet.getString("status"),
					resultSet.getString("codigo")
					);
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return UnUsuario;
	}
	
}
