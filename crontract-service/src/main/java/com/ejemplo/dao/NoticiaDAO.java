package com.ejemplo.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;


import com.ejemplo.paquete.dto.Noticia;





public class NoticiaDAO extends Conexion {


	public LinkedList<Noticia> ObtenerNoticias(){
		String tiraSQL = "SELECT * FROM tb_noticia";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<Noticia> listaNoticia= new LinkedList<Noticia>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaNoticia.add(new Noticia(resultSet.getString("codigo"),
					resultSet.getString("status"),	
					resultSet.getString("codigo_sistema"),
					resultSet.getString("tipo_noticia"),	
					resultSet.getString("titulo"),	
					resultSet.getString("contenido"),
					resultSet.getString("imagen"),
					resultSet.getDate("fecha")));		
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaNoticia;
	}
	
	public LinkedList<Noticia> ObtenerNoticia(String codigo){
		String tiraSQL = "SELECT * FROM tb_noticia where codigo='"+codigo+"'";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<Noticia> listaNoticia= new LinkedList<Noticia>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaNoticia.add(new Noticia(resultSet.getString("codigo"),
							resultSet.getString("status"),	
					resultSet.getString("codigo_sistema"),
					resultSet.getString("tipo_noticia"),	
					resultSet.getString("titulo"),	
					resultSet.getString("contenido"),
					resultSet.getString("imagen"),
					resultSet.getDate("fecha")));
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaNoticia;
	}
	
	
	/*
	public void RegistrarNoticia(Noticia n){
		String tiraSQL= "INSERT INTO tb_noticia (codigo, descripcion, status, imagen, codigo_sistema,fecha) "
				+ "VALUES ('"+n.getCodigo()+"'"+",'"+ n.getDescripcion()+"','"+ n.getStatus()+"'"
						+ ",'"+ n.getImagen()+"','"+ n.getCodigo_sistema()+"','"+ n.getFecha()+"'"
						+ ")";
		Conexion.ejecutar(tiraSQL);
	}
	*/
	
}
