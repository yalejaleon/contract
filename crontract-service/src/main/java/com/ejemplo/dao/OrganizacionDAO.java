package com.ejemplo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.ejemplo.paquete.dto.Organizacion;



public class OrganizacionDAO {

	
	public LinkedList<Organizacion> ObtenerOrganizacion(){
		String tiraSQL = "SELECT * FROM tb_Organizacion where status='Activo'";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<Organizacion> listaOrganizacion= new LinkedList<Organizacion>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaOrganizacion.add(new Organizacion(resultSet.getString("mision"),
					resultSet.getString("vision")
					));
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaOrganizacion;
	}
}
