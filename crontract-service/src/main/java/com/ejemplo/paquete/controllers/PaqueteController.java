package com.ejemplo.paquete.controllers;



import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ejemplo.dao.CitaDAO;
import com.ejemplo.dao.CiudadDAO;
import com.ejemplo.dao.ClienteDAO;
import com.ejemplo.dao.ComentarioDAO;
import com.ejemplo.dao.DetalleSolicitudDAO;
import com.ejemplo.dao.EstadoDAO;
import com.ejemplo.dao.EsteticistaDAO;
import com.ejemplo.dao.NoticiaDAO;
import com.ejemplo.dao.ObjetivoDAO;
import com.ejemplo.dao.OcupacionDAO;
import com.ejemplo.dao.OrganizacionDAO;
import com.ejemplo.dao.PaqueteDAO;
import com.ejemplo.dao.ReferidoDAO;
import com.ejemplo.dao.ServicioDAO;
import com.ejemplo.dao.ServicioGeneralDAO;
import com.ejemplo.dao.SliderDAO;
import com.ejemplo.dao.SolicitudDAO;
import com.ejemplo.dao.TipoComentarioDAO;
import com.ejemplo.dao.TipoPreguntaDAO;
import com.ejemplo.dao.UsuarioWebDAO;
import com.ejemplo.dao.UsuarioDAO;
import com.ejemplo.paquete.dto.Cita;
import com.ejemplo.paquete.dto.Ciudad;
import com.ejemplo.paquete.dto.Cliente;
import com.ejemplo.paquete.dto.Comentario;
import com.ejemplo.paquete.dto.DetallePaquete;
import com.ejemplo.paquete.dto.DetalleSolicitud;
import com.ejemplo.paquete.dto.Estado;
import com.ejemplo.paquete.dto.Esteticista;
import com.ejemplo.paquete.dto.Noticia;
import com.ejemplo.paquete.dto.Objetivo;
import com.ejemplo.paquete.dto.Ocupacion;
import com.ejemplo.paquete.dto.Organizacion;
import com.ejemplo.paquete.dto.Paquete;
import com.ejemplo.paquete.dto.Referido;
import com.ejemplo.paquete.dto.Servicio;
import com.ejemplo.paquete.dto.ServicioGeneral;
import com.ejemplo.paquete.dto.ServiciosEspecifico;
import com.ejemplo.paquete.dto.Slider;
import com.ejemplo.paquete.dto.Solicitud;
import com.ejemplo.paquete.dto.TipoComentario;
import com.ejemplo.paquete.dto.TipoPregunta;
import com.ejemplo.paquete.dto.Usuario;
import com.ejemplo.paquete.dto.UsuarioWeb;


@RestController
@RequestMapping( value = PaqueteController.CONTRACT_BASE_URI )
public class PaqueteController {

	public static final String CONTRACT_BASE_URI = "/spa";
	
	//todos los paquetes
	
	@RequestMapping(value = "/paquetes" , method= RequestMethod.GET)
	public List<Paquete>  getPaquete(){
		 PaqueteDAO paqueteSpa = new PaqueteDAO();
		 
		 LinkedList<Paquete> paquetes = paqueteSpa.ObtenerPaquetes();
		 return paquetes;
		
	}
	/*Prueba de un paquete en especial
	@RequestMapping(value = "/paquetes/{codigo}" , method= RequestMethod.GET)
	public List<Paquete>  getPaquete(@PathVariable String codigo){
		 PaqueteDAO paqueteSpa = new PaqueteDAO();
		 
		 LinkedList<Paquete> paquetes = paqueteSpa.ObtenerPaquete(codigo);
		 return paquetes;
		
	}
	*/
	////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/noticias", method= RequestMethod.GET)
	public List<Noticia>  getNoticia(){
		 NoticiaDAO noticiaSpa= new NoticiaDAO();
		 
		 LinkedList<Noticia> noticias = noticiaSpa.ObtenerNoticias();
		 
		 return noticias;
		
	}
	
	//Una noticia en especifico
	@RequestMapping(value = "/noticias/{codigo}" , method= RequestMethod.GET)
	public List<Noticia>  getNoticia(@PathVariable String codigo){
		 NoticiaDAO noticiaSpa= new NoticiaDAO();
		 
		 LinkedList<Noticia> noticias = noticiaSpa.ObtenerNoticia(codigo);
		 return noticias;
		
	}
	
	//Registrar una noticia que funciona
	
	/*
	@RequestMapping(value = "/noticia/{codigo}/{descripcion}", method = RequestMethod.POST)
	 
    public void CrearNoticia(@PathVariable String codigo, @PathVariable String descripcion) throws ParseException {
		
		Date fecha1= new Date(2112, 12, 2);
	    //Date fecha =   (Date) df.parse(target);  
	        
        Ocupacio noticia= new Ocupacio(codigo, descripcion, "fdf", "sfsf", "12345", fecha1 );
		NoticiaDAO noticiaSpa= new NoticiaDAO();
	 noticiaSpa.RegistrarNoticia(noticia);
	 System.out.println("Se Registro con Exito");
	 System.out.println(codigo);
	 System.out.println(descripcion);
	 
	 
        }
	*/
	
	/*
	@RequestMapping(value = "/noticia/{codigo}/{descripcion}/{status}/{imagen}", method = RequestMethod.POST)
	 
    public void CrearNoticia(@PathVariable String codigo, @PathVariable String descripcion, @PathVariable String status,@PathVariable String imagen) throws ParseException {
		
		Date fecha1= new Date(2112, 12, 2);
	    //Date fecha =   (Date) df.parse(target);  
	        
        Noticia noticia= new Noticia(codigo, descripcion, status, imagen , "12345", fecha1 );
		NoticiaDAO noticiaSpa= new NoticiaDAO();
	 noticiaSpa.RegistrarNoticia(noticia);
	 System.out.println("Se Registro con Exito");
	 System.out.println(codigo);
	 System.out.println(descripcion);
	 System.out.println(status);
	 System.out.println(imagen);
		}
	
	*/
	/*
	@RequestMapping(value = "/noticia/{codigo}/{descripcion}/{status}/{imagen}/{codigo_sistema}/{fecha}", method = RequestMethod.GET)
	 
    public void CrearNoticia(@PathVariable String codigo, @PathVariable String descripcion, @PathVariable String status,@PathVariable String imagen,@PathVariable String codigo_sistema,@PathVariable String fecha) throws ParseException {
		System.out.println("entro");
	//Date fecha1= new Date(2112, 12, 2);
		
		//DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		//String fechita = fecha;
	    //Date fecha =   (Date) df.parse(target);  
		
		//SimpleDateFormat formato= new SimpleDateFormat("dd-MM-yyyy");
		//Date date= (Date) formato.parse(fecha);
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date parsed = (Date) format.parse(fecha);
        java.sql.Date sql = new java.sql.Date(parsed.getTime());
		
		
		System.out.println(sql);
		
		
		try {
			
			
			
		
        Noticia noticia= new Noticia(codigo, descripcion, status, imagen , codigo_sistema, sql);
		NoticiaDAO noticiaSpa= new NoticiaDAO();
	 noticiaSpa.RegistrarNoticia(noticia);
	 System.out.println("Se Registro con Exito");
	 System.out.println(codigo);
	 System.out.println(descripcion);
	 System.out.println(status);
	 System.out.println(imagen);
	 System.out.println(sql);
		} catch (Exception e) {
			System.out.println("entro en el Exception");
			System.out.println("peuwb"+e.getMessage()+ e.getCause());
		}
		}
	*/
	////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/servicios", method= RequestMethod.GET)
	public List<Servicio>  getServicio(){
		 ServicioDAO servicioSpa = new ServicioDAO() ;
		 
		 LinkedList<Servicio> servicios = servicioSpa.ObtenerServicios();
		 
		 return servicios;
		
	}
	
	//************** Servicios de Cliente**************************/
	@RequestMapping(value = "/clientes", method= RequestMethod.GET)
	public List<Cliente>  getCliente(){
		ClienteDAO clienteSpa = new ClienteDAO() ;
		 
		 LinkedList<Cliente> clientes = clienteSpa.ObtenerClientes();
		 
		 return clientes;
		
	}
	
	@RequestMapping(value = "/noticia/{cedula}/{nombre}/{apellido}/{telefono}/{correo}/{ciudad}/{codigo_acuerdo}", method = RequestMethod.GET)
	 
    public void RegistarCliente(@PathVariable String cedula, 
    		@PathVariable String nombre, @PathVariable 
    		String apellido,@PathVariable String correo
    		,@PathVariable String telefono,@PathVariable String ciudad,@PathVariable String codigo_acuerdo) throws ParseException {
		    
        Cliente cliente= new Cliente(cedula,nombre,apellido,correo ,telefono,ciudad ,codigo_acuerdo );
		ClienteDAO clienteSpa= new ClienteDAO();
	 clienteSpa.RegistrarCliente(cliente);;
	 System.out.println("Se Registro con Exito");
	 System.out.println(ciudad);
		}
	
	 @RequestMapping(value = "/cliente", method = RequestMethod.POST)
	 
	    public void CrearCliente(@RequestBody Cliente cliente) {
	        
		 ClienteDAO clienteSpa = new ClienteDAO();
		 clienteSpa.RegistrarCliente(cliente);
		 System.out.println("Se Registro con Exito");
	        }
	 //*******************************************************************/
	 
	 
	 //Servicios de Ocupacion
	 
	 @RequestMapping(value = "/ocupaciones", method= RequestMethod.GET)
		public List<Ocupacion>  getOcupacion(){
			OcupacionDAO ocupacion = new OcupacionDAO() ;
			 
			 LinkedList<Ocupacion> ocupacionSpa = ocupacion.ObtenerOcupacion();
			 
			 return ocupacionSpa;
			
		}
	 
	 @RequestMapping(value = "/ocupacion", method = RequestMethod.POST)
	 
	    public void CrearOcuapcion(@RequestBody Ocupacion ocupacion) {
	        
		 OcupacionDAO ocup = new OcupacionDAO() ;
		 ocup.RegistrarOcupacion(ocupacion);
		 System.out.println("Se Registro con Exito");
	        }
	 
	 // ****************************Servicios de Solicitud*****************************************
	 
	 
	 @RequestMapping(value = "/solicitud/{codigo}/{codigo_cliente}/{status}/{fecha}", method = RequestMethod.GET)
	 
	    public void RegistarCliente(@PathVariable String codigo, 
	    		@PathVariable String codigo_cliente, @PathVariable 
	    		String status,@PathVariable String fecha) throws ParseException {
			    
	        Solicitud solicitud = new Solicitud(codigo,codigo_cliente,status,fecha);
			SolicitudDAO solicitudSpa= new SolicitudDAO();
		 solicitudSpa.RegistrarSolicitud(solicitud);
		 System.out.println("Se Registro la solicitud con Exito");
		
			}
	 
	 
	// ****************************Servicios detalle de Solicitud*****************************************
	 
	 
		 @RequestMapping(value = "/DetalleSolicitud/{codigo_solicitud}/{codigo_paquete}/{codigo_servicio}/{codigo}/{status}", method = RequestMethod.GET)
		 
		    public void RegistarDetalle(@PathVariable String codigo_solicitud, 
		    	@PathVariable String codigo_paquete, @PathVariable 
		    	String codigo_servicio,@PathVariable String codigo,@PathVariable String status) throws ParseException {			    
		        DetalleSolicitud dt = new DetalleSolicitud(codigo_solicitud, codigo_paquete, codigo_servicio, codigo, status);
				DetalleSolicitudDAO detalleSpa= new DetalleSolicitudDAO();
				detalleSpa.RegistrarDetalle(dt);
			 System.out.println("Se Registro el detalle con Exito");
			
				}
		 
		 
			// ****************************Servicios Para Registrar la Cita*****************************************
		 
		 
		 @RequestMapping(value = "/Cita/{codigo}/{codigo_detalle_solicitud}/{codigo_agenda}/{status}/{fecha}", method = RequestMethod.GET)
		 
		    public void RegistarCita(@PathVariable String codigo, 
		    	@PathVariable String codigo_detalle_solicitud, @PathVariable 
		    	String codigo_agenda,@PathVariable String status,@PathVariable String fecha) throws ParseException {			    
		       	Cita c= new Cita(codigo, codigo_detalle_solicitud, codigo_agenda, status, fecha);
				CitaDAO citaSpa= new CitaDAO();
				citaSpa.RegistrarCita(c);
			 System.out.println("Se Registro la cita con exito con Exito");
			
				}
	 
		 
//		// ****************************Servicios Registrar el usuario web*****************************************
//		 
//		 
//				 @RequestMapping(value = "/usuarioweb/{cedula}/{nombre}/{apellido}/{telefono}/{correo}/{ciudad}", method = RequestMethod.GET)
//				 
//				    public void RegistarUsuarioWeb(@PathVariable String cedula, 
//				    	@PathVariable String nombre, @PathVariable 
//				    	String apellido,@PathVariable String telefono,@PathVariable String correo,@PathVariable String ciudad) throws ParseException {			    
//				       	UsuarioWeb uweb= new UsuarioWeb(cedula, nombre, apellido, telefono, correo, ciudad);
//						UsuarioWebDAO webSpa=new UsuarioWebDAO();
//						webSpa.RegistrarUsuarioWeb(uweb);
//					 System.out.println("Se Registro la cita con exito con Exito");
//					
//						}
	  //****************************Servicio para la referencia**************************************************
			 
				 @RequestMapping(value = "/referencias" , method= RequestMethod.GET)
					public List<Referido>  getReferido(){
					 ReferidoDAO referenciaSpa = new ReferidoDAO();
						 
						 LinkedList<Referido> referencias = referenciaSpa.ObtenerReferido();
						 return referencias;
						
					}		
				/*****************Servicios de Estados*****************************************************/ 
				 @RequestMapping(value = "/estados" , method= RequestMethod.GET)
					public List<Estado>  getEstado(){
					 EstadoDAO EstadoSpa = new EstadoDAO();
						 
						 LinkedList<Estado> estados = EstadoSpa.ObtenerEstados();
						 return estados;
						
					}	
				 /*****************Servicios de Ciudades*****************************************************/ 
				 @RequestMapping(value = "/ciudades" , method= RequestMethod.GET)
					public List<Ciudad>  getCiudad(){
					 CiudadDAO CiudadSpa = new CiudadDAO();
						 
						 LinkedList<Ciudad> ciudades= CiudadSpa.ObtenerCiudad();
						 return ciudades;
						
					}	
				 /*****************Servicios de Estados*****************************************************/ 
				 @RequestMapping(value = "/esteticistas" , method= RequestMethod.GET)
					public List<Esteticista>  getEsteticista(){
					 EsteticistaDAO EsteticistaSpa = new EsteticistaDAO();
						 
						 LinkedList<Esteticista> Esteticistas= EsteticistaSpa.ObtenerEsteticistas();
						 return Esteticistas;
						
					}
				 
				 /***************Servicio de Organizacion*********************************************************************/
				 
				 @RequestMapping(value = "/organizacion" , method= RequestMethod.GET)
					public List<Organizacion>  getOrganizacion(){
					 OrganizacionDAO OrganizacionSpa = new OrganizacionDAO();
						 
						 LinkedList<Organizacion> org= OrganizacionSpa.ObtenerOrganizacion();
						 return org ;
				 }
				 /***************Servicio de Objetivos*********************************************************************/
				
				 @RequestMapping(value = "/objetivo" , method= RequestMethod.GET)
					public List<Objetivo>  getObjetivo(){
					 ObjetivoDAO ObjetivoSpa = new ObjetivoDAO();
						 
						 LinkedList<Objetivo> objetivos= ObjetivoSpa.ObtenerObjetivo();
						 return objetivos ;

				 }
				 
				 /***************Servicio de Usuarios*********************************************************************/
					
				 @RequestMapping(value = "/usuarios" , method= RequestMethod.GET)
					public List<Usuario>  getUsuario(){
					 UsuarioDAO usuarioSpa= new UsuarioDAO();
						 
						 LinkedList<Usuario> usuarios= usuarioSpa.ObtenerUsuario(); 
						 return usuarios ;}
		/***************Servicio de un Usuario*********************************************************************/
							
						 @RequestMapping(value = "/usuario/{usuario}/{contrasenna}" , method= RequestMethod.GET)
							public Usuario  getUsuario(String usuario, String contrasenna){
							 UsuarioDAO usuarioSpa= new UsuarioDAO();
								 
								 Usuario usuario1= usuarioSpa.ObtenerUnUsuario(usuario, contrasenna); 
								 return usuario1 ;

				 }
				 /***************Servicio de Servicios Generales (Slider de Servicios)*********************************************************************/
					
				 @RequestMapping(value = "/generales" , method= RequestMethod.GET)
					public List<ServicioGeneral>  getServicioGeneral(){
					 ServicioGeneralDAO ServicioGeneralSpa= new ServicioGeneralDAO();
						 
						 LinkedList<ServicioGeneral> generales= ServicioGeneralSpa.ObtenerServicioGeneral() ; 
						 return generales ;

				 }
				 
				 
				 
				 /***************Servicio de Servicios Especificos(Slider de Servicios)**********/
					@RequestMapping(value = "/especificos/{codigo}" , method= RequestMethod.GET)
					public List<ServiciosEspecifico>  getServiciosEspecifico(@PathVariable String codigo){
						 ServicioDAO ServiciosEspecificoSpa= new ServicioDAO();
						 
						 LinkedList<ServiciosEspecifico> especificos = ServiciosEspecificoSpa.ObtenerServicios(codigo);
						 System.out.println("Mostro todos los servicios especificos");
						 return especificos;
						
					}
					
					 /***************Servicio de Servicios Especificos(Slider de Servicios)**********/
					@RequestMapping(value = "/detalleServicio/{codigo}" , method= RequestMethod.GET)
					public List<Servicio>  getDetalle(@PathVariable String codigo){
						 ServicioDAO DetalleServicioSpa= new ServicioDAO();
						 
						 LinkedList<Servicio> detalles = DetalleServicioSpa.DetalleServicios(codigo);
						 System.out.println("Mostro todos el detalle servicios");
						 return detalles;
						
					}
					
					/***************Servicio de detale paquete (Slider de detalle de paquete)**********/
					@RequestMapping(value = "/detallePaquete/{codigo}" , method= RequestMethod.GET)
					public List<DetallePaquete>  getDetallePaquete(@PathVariable String codigo){
						 PaqueteDAO DetallePaqueteSpa= new PaqueteDAO();
						 
						 LinkedList<DetallePaquete> detalles = DetallePaqueteSpa.ObtenerServiciosXPaquete(codigo);
						 System.out.println("Mostro todos el detalle paquete");
						 return detalles;
						
					}
					
					/******************Servicio de todos los tipo comentario **********************************/
					@RequestMapping(value = "/tipoComentario", method= RequestMethod.GET)
					public List<TipoComentario>  getTipoComentario(){
						TipoComentarioDAO TipoComentarioSpa= new TipoComentarioDAO();
						 
						 LinkedList<TipoComentario> comentarios = TipoComentarioSpa.ObtenerTipoComentario();
						 
						 return comentarios;
						
					}
					
					/******************Servicio de todos los tipo pregunta **********************************/
					@RequestMapping(value = "/tipoPregunta", method= RequestMethod.GET)
					public List<TipoPregunta>  getTipoPregunta(){
						TipoPreguntaDAO TipoPreguntaSpa= new TipoPreguntaDAO();
						 
						 LinkedList<TipoPregunta> preguntas = TipoPreguntaSpa.ObtenerTipoPregunta();
						 
						 return preguntas;
						
					}
					
					/****************************Servicio para el Slider**************************************************/
					 
					 @RequestMapping(value = "/slider" , method= RequestMethod.GET)
						public List<Slider>  getSlider(){
						 SliderDAO SliderSpa = new SliderDAO();
							 
							 LinkedList<Slider> slides = SliderSpa.ObtenerSlider();
							 return slides;
							
						}
					 
					 /***************Servicio el detalle del slider principal (deyalle del slider)**********/
						@RequestMapping(value = "/detalleSlider/{codigo}" , method= RequestMethod.GET)
						public List<Slider>  getDetalleSlider(@PathVariable String codigo){
							 SliderDAO DetalleSliderSpa= new SliderDAO();
							 
							 LinkedList<Slider> slides = DetalleSliderSpa.ObtenerUnSlider(codigo);
							 System.out.println("Mostro todos el detalle del slider");
							 return slides;
							
						}
					 
						 /***************Servicio para encontrar una ciudad por un estado**********/
						@RequestMapping(value = "/ciudad/{codigo}" , method= RequestMethod.GET)
						public List<Ciudad>  getCiudad(@PathVariable String codigo){
							 CiudadDAO unaCiudadSpa= new CiudadDAO();
							 
							 LinkedList<Ciudad> detalles = unaCiudadSpa.ObtenerUnaCiudad(codigo);
							 System.out.println("Mostro todas las ciudad de ese estado");
							 return detalles;
							
						}
						// ****************************Servicios Registrar Comentario*****************************************
						 
						 
						 @RequestMapping(value = "/coment/{nombre}/{apellido}/{cedula}/{correo}/{telefono}/{sexo}/{ciudad}/{motivo}/{relacion}/{pregunta}/{clase_comentario}", method = RequestMethod.POST)
						
						    public void RegistarUsuarioWeb( 
						    	@PathVariable String nombre, @PathVariable 
						    	String apellido,@PathVariable String cedula,@PathVariable String correo,@PathVariable String telefono,@PathVariable String sexo,@PathVariable String ciudad,@PathVariable String motivo,
						    	@PathVariable String relacion,@PathVariable String pregunta,@PathVariable String clase_comentario) throws ParseException, UnsupportedEncodingException {			    
						       	ComentarioDAO comentariodao= new ComentarioDAO();
						       	String codigoComentario,status;
//						       	
						       
						       String Coment=URLDecoder.decode(clase_comentario, "UTF-8");
						       	status="Activo";
						       	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
						       	java.util.Date utilDate = new java.util.Date();
						       	java.sql.Timestamp sq3 = new java.sql.Timestamp(utilDate.getTime());  
//								
						       	
										if(comentariodao.codigoUsuario(correo)!=null){
											System.out.println(comentariodao.codigoUsuario(correo));
											codigoComentario=comentariodao.TotalRegistros();
											System.out.println(correo+" entro porque encontro un correo de usuario");
											Comentario comentario= new Comentario(
										    relacion,codigoComentario,Coment,correo,status,"null",motivo,sq3); 
											comentariodao.RegistrarComentario(comentario);
											System.out.println("Se Registro ucomentario de usuario ");
										}else{
								 codigoComentario=comentariodao.TotalRegistros();						
						
								 UsuarioWeb uweb= new UsuarioWeb(cedula, nombre, apellido,correo, telefono, ciudad,sexo);
								 UsuarioWebDAO udao= new UsuarioWebDAO();
								 udao.RegistrarUsuarioWeb(uweb);
								 Comentario comentario= new Comentario(
											relacion,codigoComentario,Coment,"null",status,cedula,motivo,sq3); 
									 comentariodao.RegistrarComentarioUsuarioWeb(comentario);
									 System.out.println("Se Registro un comentario de usuarioweb con exito");
								 
							 }
							 		

						 }		 
}
