package com.ejemplo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.ejemplo.paquete.dto.Cliente;


public class ClienteDAO extends Conexion {

	public LinkedList<Cliente> ObtenerClientes(){
		String tiraSQL = "SELECT * FROM tb_cliente";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		LinkedList<Cliente> listaCliente= new LinkedList<Cliente>();
		try {
			if(resultSet!=null){
				while(resultSet.next()){
					listaCliente.add(new Cliente(resultSet.getString("cedula"),
					resultSet.getString("nombre"),					
					resultSet.getString("apellido"),
					resultSet.getString("telefono"),
					resultSet.getString("correo"),
					resultSet.getString("ciudad"),
					resultSet.getString("codigo_acuerdo")));
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaCliente;
	}
	
	public void RegistrarCliente(Cliente c){
		String tiraSQL= "INSERT INTO tb_cliente (cedula,nombre,apellido,correo,telefono,ciudad,codigo_acuerdo) "
				+ "VALUES ('"+c.getCedula()+"','"+ c.getNombre()+"','"+ c.getApellido()+"'"
						+ ",'"+ c.getTelefono()+"','"+ c.getCorreo()+"','"+ c.getCiudad()+"'"
						+ ",'"+ c.getCodigo_acuerdo()+"')";
		Conexion.ejecutar(tiraSQL);
		System.out.println(tiraSQL);
	}
	
	
}
