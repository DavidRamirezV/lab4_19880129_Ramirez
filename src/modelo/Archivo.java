package modelo;

import java.util.Date;
import java.util.LinkedList;
import java.text.SimpleDateFormat;

/**
 * TDA de Archivo, tiene un String nombre del archivo, un String fecha de creacion
 * y un String que representa el contenido del archivo.
 * @author David Ramirez
 *
 */
public class Archivo {
	//ATRIBUTOS
	private String nombre;	
	private String fecha;	
	private String contenido;

	
	//Getters y Setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	
	//METODOS
	
   
    //Constructor
    /**
     * Constructor de la clase Archivo.
     * 
     */
    public Archivo() {
	}
    /**
     * Constructor de la clase Archivo.
     * @param nombre - String con un nombre del Archivo
     * @param contenido - String con el contenido del Archivo
     */
    public Archivo (String nombre,String contenido){
	    
        this.setNombre(nombre);	        
        this.obtenerFecha();	                
        this.setContenido(contenido);	     
    }
    
    /**
     *Metodo para obtener la fecha y hora actual al equipo y transformarlo a String
     *para guardarlo en el atributo "fecha" de la clase Archivo.
     */
    public void obtenerFecha(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fecha = new Date();
        this.fecha = formato.format(fecha);
    }
    

    /** Metodo para anadir un archivo a una lista enlazada de archivos o sobrescribirlo en caso
     * de que este archivo ya existiera en la lista enlazada.
     * @param Lista - lista enlazada con elementos del tipo clase Archivo
     * @param archivo - elemento del tipo clase Archivo
     */
    public static void anadirArchivoLista(LinkedList<Archivo> Lista, Archivo archivo) {
		if (Lista.size()==0 || Lista == null) {
			Lista.add (archivo);
		}
		
		else {
			for(int i=0;i < Lista.size();i++) {
				if (archivo.getNombre().equals(Lista.get(i).getNombre())) {
					Lista.set(i,archivo);
					break;
					
			    }
				else if (i+1 == Lista.size()) {
					Lista.add (archivo);
					break;
					
				}
					
			}
		}
		
    }
    
    
}



