package modelo;

import java.util.LinkedList;

/**
 * Clase que hereda de Repository que representa la zona de trabajo Index, se utliza para implementar los metodos relacionados
 * a Index y asi mantener alta la cohesion de la clase Repository.
 * @author David Ramirez
 *
 */
public class Index extends Repository{
		
	//METODOS
	/**Metodo que se encarga de agregar un nuevo Commit a Local Repository.
	 * 
	 * @param mensaje - String con un mensaje sobre los cambios que hara el usuario
	 * @param rep - Repository que representa el repositorio actual
	 * @return Lista enlazada de Commits, esta representa un nuevo Local Repository con los cambios anadidos
	 */
	public static LinkedList<Commit> gitCommit (String mensaje,Repository rep){
		
        LinkedList<Archivo> archivosRepositorio = new LinkedList<Archivo>();
        
        if (rep.getRemoteRepository() == null || rep.getRemoteRepository().size() == 0 ) {
        	for (int i = 0; i< rep.getIndex().size();i++) {        		
        		Archivo.anadirArchivoLista(archivosRepositorio, rep.getIndex().get(i));
        	}               	
        }        
        else {        	
        	for (int i=0; i<rep.getRemoteRepository().getLast().getArchivosCommit().size();i++) {
        		archivosRepositorio.add(rep.getRemoteRepository().getLast().getArchivosCommit().get(i));
        	}
        	for (int i = 0; i< rep.getIndex().size();i++) {
        		Archivo.anadirArchivoLista(archivosRepositorio, rep.getIndex().get(i));	
        	}
        }
        
        Commit nuevoCommit = new Commit(mensaje,rep.getIndex(),archivosRepositorio);
        LinkedList<Commit> nuevoLocal = new LinkedList<Commit>();
        if(rep.getLocalRepository() == null || rep.getLocalRepository().size() == 0){
        	nuevoLocal.add(nuevoCommit);
	    }
        else {
        	 nuevoLocal.addAll(rep.getLocalRepository());
             nuevoLocal.add(nuevoCommit);
        }
        
        return nuevoLocal; 
	}
	
}
