package com.ejemplo.paquete.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.dao.CitaDAO;
import com.ejemplo.dao.CubiculoDAO;
import com.ejemplo.dao.EsteticistaDAO;
import com.ejemplo.dao.NoticiaDAO;
import com.ejemplo.dao.NotificacionDAO;
import com.ejemplo.dao.ServicioDAO;
import com.ejemplo.dao.UsuarioDAO;
import com.ejemplo.paquete.dto.Cita;
import com.ejemplo.paquete.dto.CitaPendiente;
import com.ejemplo.paquete.dto.Cubiculo;
import com.ejemplo.paquete.dto.Esteticista;
import com.ejemplo.paquete.dto.Noticia;
import com.ejemplo.paquete.dto.Notificacion;
import com.ejemplo.paquete.dto.Servicio;
import com.ejemplo.paquete.dto.Usuario;

@RestController
@RequestMapping( value = ServiciosMovil.CONTRACT_BASE_URI )
public class ServiciosMovil {
	
	public static final String CONTRACT_BASE_URI = "/BambuMovil";
	
	/******************LISTA DE NOTICIAS******************/
	@RequestMapping(value = "/noticias", method= RequestMethod.GET)
	public List<Noticia>  getNoticia(){
		 NoticiaDAO noticiaSpa= new NoticiaDAO();
		 
		 LinkedList<Noticia> noticias = noticiaSpa.ObtenerNoticias();
		 
		 return noticias;
	}
	
	
	 /***************Servicio de Usuarios*********************************************************************/
	//LISTA DE USUARIOS
	 @RequestMapping(value = "/usuarios" , method= RequestMethod.GET)
		public LinkedList<Usuario>  getUsuario(){
		 UsuarioDAO usuarioSpa= new UsuarioDAO();
			 
			 LinkedList<Usuario> usuarios= usuarioSpa.ObtenerUsuario();
			
			 return usuarios;
	 }
	//UN USUARIO
	 @RequestMapping(value = "/usuario/{usuario}/{contrasenna}" , method= RequestMethod.GET,  produces = MediaType.APPLICATION_JSON_VALUE)
		public Usuario  obtenerSoloUsuario(@PathVariable String usuario, @PathVariable String contrasenna){
		 UsuarioDAO usuarioSpa= new UsuarioDAO();
			 
			 Usuario u= usuarioSpa.ObtenerUnUsuario(usuario, contrasenna); 
			 return u ;
	 }
		/***********************CONSULTAR NOTIFICACIONES DEL USUARIO******************************/
		
	 @RequestMapping(value = "/notificaciones/{usuario}/{contrasenna}", method= RequestMethod.GET)
		public List<Notificacion>  getNotificacion(@PathVariable String usuario, @PathVariable String contrasenna){
		 
		 System.out.println(usuario); 
			 NotificacionDAO notificacionSpa= new NotificacionDAO();
			 
			 List<Notificacion> notificacion= notificacionSpa.ObtenerNotificacion(usuario, contrasenna);
			 return notificacion;
		}
		
	 
	 /***************Una lista de citas pendientes*********************************************************************/

			@RequestMapping(value = "/citasPendientes/{usuario}/{contrasenna}" , method= RequestMethod.GET)
			public List<CitaPendiente>  getCitaPendiente(@PathVariable String usuario,@PathVariable String contrasenna){
				
				CitaDAO citaSpa= new CitaDAO();
				 
				 LinkedList<CitaPendiente> citas = citaSpa.ConsultarCitaPendiente(usuario, contrasenna);
				 return citas;

			}
			
	/***************Actualizar estatus de cita CANCERLAR CITA*********************************************************************/
		
			
		//ROL CLIENTE
			@RequestMapping(value = "/ActualizaCita/{codigo}" , method= RequestMethod.GET)
			public void ActualizarCita(@PathVariable String codigo){
				CitaDAO cita_obj = new CitaDAO();
				cita_obj.ActualizarCita(codigo);
				 System.out.println("Se Registro con Exito");
				}
		//ROL ESTETICISTA (enviar notificacion)
			
			
			
	/***************PAQUETES POR USUARIO*********************************************************************/


			
			
			
			
	/***************SERVICIOS POR PAQUETE E INDICADORES**********************************/


			
			
	/***********************CONSULTAR AVANCE DE SESIONES******************************/
			
			
		
			
			
			
			
		
			
			
			
	/***********************CONSULTAR ESTETICISTAS ATENDIDOS AL USUARIO******************************/

			
			@RequestMapping(value = "/EsteticistaDelCliente/{usuario}/{contrasenna}" , method= RequestMethod.GET)
			public List<Esteticista>  getEsteticistasDelCliente(@PathVariable String usuario,@PathVariable String contrasenna){

				 System.out.println(usuario);
				 System.out.println(contrasenna);
				
				EsteticistaDAO esteticistaSpa= new EsteticistaDAO();
				 
				 LinkedList<Esteticista> esteticistas = esteticistaSpa.ObtenerEsteticistaDelCliente(usuario, contrasenna);
				 return esteticistas;
			}
	/***********************CONSULTAR CUBICULOS USADOS POR EL USUARIO******************************/
			
			@RequestMapping(value = "/CubiculoDelCliente/{usuario}/{contrasenna}" , method= RequestMethod.GET)
			public List<Cubiculo>  getCubiculoDelCliente(@PathVariable String usuario,@PathVariable String contrasenna){


				CubiculoDAO CubiculoSpa= new CubiculoDAO();
				 
				 LinkedList<Cubiculo> cubiculos = CubiculoSpa.ObtenerCubiculoDelCliente(usuario, contrasenna);
				 return cubiculos;
			}
			
	/***********************CONSULTAR SERVICIOS USADOS POR EL USUARIO******************************/

			@RequestMapping(value = "/ServicioDelCliente/{usuario}/{contrasenna}" , method= RequestMethod.GET)
			public List<Servicio>  getServicioDelCliente(@PathVariable String usuario,@PathVariable String contrasenna){


				ServicioDAO ServicioSpa= new ServicioDAO();
				 
				 LinkedList<Servicio> Servicio = ServicioSpa.ObtenerServicioDeCliente(usuario, contrasenna);
				 return Servicio;
			}



			/***********************REGISTRAR COMENTARIO******************************/
			
			
			
			
			
			

			/***********************REGISTRAR CALIFICACION*******************/
			
	


}
