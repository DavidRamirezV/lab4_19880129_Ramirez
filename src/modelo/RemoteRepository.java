package modelo;

import java.util.LinkedList;

/**
 * Clase que hereda de Repository que representa la zona de trabajo Remote Repository, se utliza para implementar los metodos relacionados
 * a Remote Repository y asi mantener alta la cohesion de la clase Repository.
 * @author David Ramirez
 *
 */
public class RemoteRepository extends Repository {
	
	//METODOS
	/**
	 * Metodo servira para llevar los Archivos de Remote Repository a Workspace 
	 * @param rep - Repository del cual se obtendra la informacion
	 * @return nuevo Workspace
	 */
	public static LinkedList<Archivo> gitPull (Repository rep){
		
		LinkedList<Archivo> listaArchivosRemote = new LinkedList<Archivo>();
  	    listaArchivosRemote.addAll(rep.getRemoteRepository().getLast().getArchivosCommit());
  	    
  	    LinkedList<Archivo> Workspace = new LinkedList<Archivo>();  	   
  	    Workspace.addAll(rep.getWorkspace());
  	    
  	    for (int i=0;i<listaArchivosRemote.size();i++) {
  	    	Archivo.anadirArchivoLista(Workspace, listaArchivosRemote.get(i));
  	    }
  	    
        return Workspace;
	}
	
}
