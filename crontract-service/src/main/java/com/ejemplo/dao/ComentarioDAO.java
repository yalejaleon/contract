package com.ejemplo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Formatter;

import com.ejemplo.paquete.dto.Comentario;

public class ComentarioDAO {

	public String codigoUsuario(String usuario){
		String tiraSQL = "SELECT * FROM tb_usuario WHERE usuario='"+usuario+"' ";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		String codigo=null;
//		boolean respuesta=false;
		System.out.println(tiraSQL);
		try {
			System.out.println("En el try");
			if(resultSet!=null){
				System.out.println("En el if");
				while(resultSet.next()){
					codigo= resultSet.getString("usuario");
//					respuesta=true;
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("en el catch");
			
		} 
		return codigo;
	
	}
	
	
public void RegistrarComentario(Comentario c){
		
		String tiraSQL= "INSERT INTO tb_comentario (tipo_comentario,codigo,descripcion,codigo_usuario,status,clase_comentario, fecha) "
				+ "VALUES ('"+c.getTipo_comentario()+"','"+ c.getCodigo()+"','"+ c.getDescripcion()+"'"
						+ ",'"+ c.getCodigo_usuario()+"','"+ c.getStatus()+"','"+ c.getClase_comentario()+"'"
						+ ",'"+ c.getFecha()+"')";
		Conexion.ejecutar(tiraSQL);
		System.out.println("registro comentario usu");
	}

public void RegistrarComentarioUsuarioWeb(Comentario c){
	
	String tiraSQL= "INSERT INTO tb_comentario (tipo_comentario,codigo,descripcion,status,codigo_usuario_web,clase_comentario, fecha) "
			+ "VALUES ('"+c.getTipo_comentario()+"','"+ c.getCodigo()+"','"+ c.getDescripcion()+"'"
					+ ",'"+ c.getStatus()+"','"+ c.getCodigo_usuario_web()+"','"+ c.getClase_comentario()+"'"
					+ ",'"+ c.getFecha()+"')";
	Conexion.ejecutar(tiraSQL);
	System.out.println("registro comentario usu");
}


public String TotalRegistros(){
	String tiraSQL = "SELECT * FROM tb_comentario";
	ResultSet resultSet = Conexion.consultar(tiraSQL);
	int numero=1;
	try {
		if(resultSet!=null){
			while(resultSet.next()){
				numero++;
			}
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		
	} 
	Formatter fmt = new Formatter();
	fmt.format("%05d", numero);
	return String.valueOf(fmt);
}
}
