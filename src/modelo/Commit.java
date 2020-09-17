package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

/**
 * TDA que representa un commit, este posee un String comentario que indica un mensaje breve que debe representar
 * los cambios en agregados o eliminados en los archivos y una lista enlazada de de la clase archivos que representa
 * los archivos actuales en el commit.
 * @author David Ramirez
 *
 */
public class Commit {
	//ATRIBUTOS
	public String comentario;
	public String fecha;
	private LinkedList<Archivo> archivosEditados;
	private LinkedList<Archivo> archivosCommit;
	
	//Getters y Setters
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public LinkedList<Archivo> getArchivosEditados() {
		return archivosEditados;
	}
	public void setArchivosEditados(LinkedList<Archivo> archivosEditados) {
		this.archivosEditados = archivosEditados;
	}
	public LinkedList<Archivo> getArchivosCommit() {
		return archivosCommit;
	}
	public void setArchivosCommit(LinkedList<Archivo> archivosCommit) {
		this.archivosCommit = archivosCommit;
	}

	//METODOS
	//Constructor
	/**
	 * Constructor de la clase Commit.
	 */
	public Commit() {
	}
	
	/**
	 * Constructor de la clase Commit.
	 * @param comentario - String que representa un pequeño mensaje del usuario
	 * @param archivosEditados - Lista enlazada de Archivos con archivos que fueron editados
	 * @param archivosCommit - Lista enlazada de Archivos con todos los archivos actuales
	 */
	public Commit(String comentario,LinkedList<Archivo> archivosEditados,LinkedList<Archivo> archivosCommit ){
		this.comentario = comentario;
		this.obtenerFecha();
		this.archivosEditados = archivosEditados;
		this.archivosCommit = archivosCommit;
	}
	
	
    /**
     *Metodo para obtener la fecha y hora actual al equipo y transformarlo a String
     *para guardarlo en el atributo "fecha" de la clase Commit.
     */
    public void obtenerFecha(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fecha = new Date();
        this.fecha = formato.format(fecha);
    }
    
	/** 
	 * Metodo que compara si dos listas enlazadas con elementos del tipo Commit son exactamente iguales.
	 * @param L1 - Lista enlazada de Commits
	 * @param L2 - Lista enlazada de Commits
	 * @return true si ambas listas poseen los mismos elementos, false si ambas listas son distintas 
	 */
	public static boolean listasIguales (LinkedList<Commit> L1, LinkedList<Commit> L2) {
		if (L1 == null && L2 == null) {
			return true;
		}	
		else if (L1 == null && L2 != null || L1 != null && L2 == null || L1.size() != L2.size() ) {
			return false;
		}
		
		return (L1.containsAll(L2) && L2.containsAll(L1));
	}

	
}
