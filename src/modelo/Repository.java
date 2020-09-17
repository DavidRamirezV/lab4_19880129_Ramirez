package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

/**
 * TDA que representa a un repositorio, posee cuatro Strings los que son el Autor del repositorio, el nombre del repositorio,
 *  fecha de creacion del repositorio y su rama actual. Ademas posee cuatro listas enlazadas, dos de ellas con elementos
 *  del tipo "clase Archivo" que representan a Worskpace e Index, las otras dos son con elementos del tipo Commit, estas
 *  representan a Local repository y a Remote repository. 
 * @author David Ramirez
 *
 */
public class Repository {
	//ATRIBUTOS
	protected String rama;
	protected String autor;
	protected String nombreRep;
	protected String fecha;
	protected LinkedList<Archivo> workspace;	
	protected LinkedList<Archivo> index;
	protected LinkedList<Commit> localRepository;
	protected LinkedList<Commit> remoteRepository;
	
	//Getters y Setters
	public String getRama() {
		return rama;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getFecha() {
		return fecha;
	}
	public String getNombreRep() {
		return nombreRep;
	}
	public void setNombreRep(String nombreRep) {
		this.nombreRep = nombreRep;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public void setRama(String rama) {
		this.rama = rama;
	}
	public LinkedList<Archivo> getWorkspace() {
		return workspace;
	}
	public void setWorkspace(LinkedList<Archivo> workspace) {
		this.workspace = workspace;
	}
	public LinkedList<Archivo> getIndex() {
		return index;
	}
	public void setIndex(LinkedList<Archivo> index) {
		this.index = index;
	}
	public LinkedList<Commit> getLocalRepository() {
		return localRepository;
	}
	public void setLocalRepository(LinkedList<Commit> localRepository) {
		this.localRepository = localRepository;
	}
	public LinkedList<Commit> getRemoteRepository() {
		return remoteRepository;
	}
	public void setRemoteRepository(LinkedList<Commit> remoteRepository) {
		this.remoteRepository = remoteRepository;
	}

	//METODOS
	
	/**
     *Metodo para obtener la fecha y hora actual al equipo y transformarlo a String
     *para guardarlo en el atributo "fecha" de la clase Repository.
     */
    public void obtenerFecha(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fecha = new Date();
        this.fecha = formato.format(fecha);
    }
    
    /**
     * Metodo que inicializa un repositorio vacio en la rama master, pide un String para saber el autor del repositorio
     * y otro String para saber el nombre del repositorio.
     * @param autor - String con el nombre del autor del repositorio 
     * @param nombreRepositorio - String con el nombre del repositorio
     * @return un Repository con las zonas de trabajo vacias.
     */
    public static Repository gitInit(String autor, String nombreRepositorio){
	    Repository rep = new Repository() {};
        rep.setAutor(autor);	        
        rep.obtenerFecha();
        rep.setNombreRep(nombreRepositorio);
        rep.setRama("master");	           
        rep.setWorkspace(null);
        rep.setIndex(null);
        rep.setLocalRepository(null);
        rep.setRemoteRepository(null);
       
        return rep;      	
   }
	
	
}
