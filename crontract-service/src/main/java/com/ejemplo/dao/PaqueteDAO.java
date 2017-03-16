package com.ejemplo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.ejemplo.paquete.dto.DetallePaquete;
import com.ejemplo.paquete.dto.Paquete;




public class PaqueteDAO extends Conexion{

	
	
	public LinkedList<Paquete> ObtenerPaquetes(){
		String tiraSQL = "SELECT * FROM tb_paquete where status='Activo'";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<Paquete> listaPaquete= new LinkedList<Paquete>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaPaquete.add(new Paquete(resultSet.getString("codigo"),
					resultSet.getString("descripcion"),
					resultSet.getString("tipo_paquete"), 
					resultSet.getString("status"),
					resultSet.getString("imagen"),
					resultSet.getDouble("precio")));
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaPaquete;
	}
	
	/*public void RegistrarUsuario(Usuario u){
		String tiraSQL= "INSERT INTO usuario (usuario, password) "
				+ "VALUES ('"+u.getUsuario()+"'"+",'"+ u.getPassword()+"')";
		Conexion.ejecutar(tiraSQL);
	}
	*/
	
	public LinkedList<DetallePaquete> ObtenerServiciosXPaquete(String codigo){
		String tiraSQL = "select p.tipo_paquete, s.titulo, s.descripcion, s.imagen from tb_detalle_paquete dp, tb_paquete p, tb_servicio s where s.codigo=dp.codigo_servicio and dp.codigo_paquete=p.codigo and p.codigo='"+codigo+"'";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<DetallePaquete> listaDetallePaquete= new LinkedList<DetallePaquete>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaDetallePaquete.add(new DetallePaquete(resultSet.getString("tipo_paquete"),
					resultSet.getString("titulo"),
					resultSet.getString("descripcion"), 
					resultSet.getString("imagen")));
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaDetallePaquete;
	}
	
	
}
