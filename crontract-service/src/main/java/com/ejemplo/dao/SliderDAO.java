package com.ejemplo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;


import com.ejemplo.paquete.dto.Slider;

public class SliderDAO {

	
	public LinkedList<Slider> ObtenerSlider(){
		String tiraSQL = "SELECT * FROM tb_slider where status='Activo'";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<Slider> listaSlider= new LinkedList<Slider>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaSlider.add(new Slider(resultSet.getString("codigo"),
					resultSet.getString("titulo"),
					resultSet.getString("leer_mas"),
					resultSet.getString("status"),
					resultSet.getString("subtitulo"),
					resultSet.getString("codigo_sistema"),
					resultSet.getString("imagen")
					));
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaSlider;
	}
	
	public LinkedList<Slider> ObtenerUnSlider(String codigo){
		String tiraSQL = "SELECT * FROM tb_slider where codigo='"+codigo+"' and status='Activo'";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<Slider> listaSlider= new LinkedList<Slider>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaSlider.add(new Slider(resultSet.getString("codigo"),
					resultSet.getString("titulo"),
					resultSet.getString("leer_mas"),
					resultSet.getString("status"),
					resultSet.getString("subtitulo"),
					resultSet.getString("codigo_sistema"),
					resultSet.getString("imagen")
					));
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaSlider;
	}
	
	
}
