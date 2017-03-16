package com.ejemplo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Conexion {

	// La descripcion del driver de la BD     
    private static String driver = "org.postgresql.Driver";
    // La direccion URL de la BD
    private static String url = "jdbc:postgresql://localhost:5432/";
    // El nombre de la BD
    private static String bd = "BambuWebservice";
    // EL login del usuario para conectarse al servidor de BD
    private static String usuario = "postgres";
    // EL password del usuario para conectarse al servidor de BD
    private static String password = "12345";
    

    private static Connection conexion;
    
    
	/**
     * Metodo utilizado para Obtener una conexion a BD
     * @return Un objeto tipo Connection que representa una conexion a la BD
     */
   
    public static Connection getConexion() {
    	try{
    		if (conexion == null || conexion.isClosed()) {	        
	        	// Cargo el driver en memoria
	            Class.forName(driver);
	            // Establezco la conexion
	            conexion=DriverManager.getConnection(url+bd,usuario,password);
	        }
    	}
        catch(SQLException e){
        	JOptionPane.showMessageDialog(null, "No se puede hacer conexion a la Base de Datos", " ", 1);
        	e.printStackTrace();
        } 
        catch (ClassNotFoundException e) {
        	JOptionPane.showMessageDialog(null, "No se puede hacer conexion a la Base de Datos", " ", 1);
        	e.printStackTrace();
		}
    	System.out.println("CONECTADO A LA BASE DE DATOS");
        return conexion;
    }

    /** * Metodo consultar
     * @param String tiraSQL
     * @return ResultSet
     */ 
    public static ResultSet consultar(String tiraSQL) {
    	getConexion();
        ResultSet resultado = null;                
        try {
            Statement sentencia= conexion.createStatement();
            resultado = sentencia.executeQuery(tiraSQL);            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        try {  
            conexion.close();            	
        }
        catch( SQLException e ) {
        	e.printStackTrace();
        }        
        return resultado;
    }

    /** * Metodo ejecutar
     * @param String TiraSQL
     * @return boolean
     */     
    public static boolean ejecutar(String tiraSQL) {
        getConexion();
        boolean ok = false;
        try {
            Statement sentencia = conexion.createStatement();
            int i = sentencia.executeUpdate(tiraSQL);
            if (i > 0) {
            	ok = true;
            }
            sentencia.close ();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    	try {  
          conexion.close();
        }
        catch( SQLException e ) {
        	e.printStackTrace();
        }
        return ok;  
    }
}
