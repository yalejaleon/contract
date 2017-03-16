package com.ejemplo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.ejemplo.paquete.dto.Ocupacion;

public class OcupacionDAO {

	
	public LinkedList<Ocupacion> ObtenerOcupacion(){
		String tiraSQL = "SELECT * FROM tb_ocupacion";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<Ocupacion> listaOcupacion= new LinkedList<Ocupacion>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaOcupacion.add(new Ocupacion(resultSet.getString("codigo"),
					resultSet.getString("descripcion"),					
					resultSet.getString("status")));
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaOcupacion;
	}
	
	
	public void RegistrarOcupacion(Ocupacion o){
	String tiraSQL= "INSERT INTO tb_ocupacion (codigo, descripcion,status) "
			+ "VALUES ('"+o.getCodigo()+"'"+",'"+ o.getDescripcion()+"','"+ o.getStatus()+"')";
	Conexion.ejecutar(tiraSQL);
}

	
}
