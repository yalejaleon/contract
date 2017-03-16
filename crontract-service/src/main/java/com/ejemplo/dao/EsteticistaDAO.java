package com.ejemplo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.ejemplo.paquete.dto.Esteticista;



public class EsteticistaDAO {

	public LinkedList<Esteticista> ObtenerEsteticistas(){
		String tiraSQL = "SELECT cedula,nombre,apellido FROM tb_esteticista order by nombre";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<Esteticista> listaEsteticista= new LinkedList<Esteticista>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaEsteticista.add(new Esteticista(resultSet.getString("cedula"),
					resultSet.getString("nombre"),
					resultSet.getString("apellido")
					));
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaEsteticista;
	}
	
	
}
