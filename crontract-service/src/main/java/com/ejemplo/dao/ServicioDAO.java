package com.ejemplo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.ejemplo.paquete.dto.Noticia;
import com.ejemplo.paquete.dto.Servicio;
import com.ejemplo.paquete.dto.ServiciosEspecifico;

public class ServicioDAO extends Conexion {


	public LinkedList<Servicio> ObtenerServicios(){
		String tiraSQL = "SELECT codigo, descripcion,tipo_servicio ,codigo_organizacion,imagen ,titulo,precio FROM tb_servicio";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<Servicio> listaServicio= new LinkedList<Servicio>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaServicio.add(new Servicio(resultSet.getString("codigo"),
					resultSet.getString("descripcion"),
					resultSet.getString("tipo_servicio"),
					resultSet.getString("codigo_organizacion"),
					resultSet.getString("imagen"),
					resultSet.getString("titulo"),
					resultSet.getDouble("precio")
					));
				
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		return listaServicio;
	}
	
	public LinkedList<ServiciosEspecifico> ObtenerServicios(String codigo){
		String tiraSQL = "select s.codigo,s.titulo,s.imagen, s.precio from tb_tipo_servicio ts, tb_servicio s where ts.codigo=s.tipo_servicio and ts.codigo='"+codigo+"' and ts.status='Activo' order by ts.codigo asc";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<ServiciosEspecifico> listaServicios= new LinkedList<ServiciosEspecifico>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaServicios.add(new ServiciosEspecifico(resultSet.getString("codigo"),
							resultSet.getString("titulo"),	
					resultSet.getString("imagen"),	
					resultSet.getDouble("precio")));
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaServicios;
	}
	
	public LinkedList<Servicio> DetalleServicios(String codigo){
		String tiraSQL = "select * from tb_servicio s where s.codigo='"+codigo+"' ";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<Servicio> listaServicio= new LinkedList<Servicio>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaServicio.add(new Servicio(resultSet.getString("codigo"),
					resultSet.getString("descripcion"),
					resultSet.getString("tipo_servicio"),
					resultSet.getString("codigo_organizacion"),
					resultSet.getString("imagen"),
					resultSet.getString("titulo"),
					resultSet.getDouble("precio")
					));
				
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaServicio;
	}
	
}
