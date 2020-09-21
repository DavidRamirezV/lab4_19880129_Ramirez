package modelo;

import java.util.LinkedList;

/**
 * Clase que hereda de Repository que representa la zona de trabajo Local Repository, se utliza para implementar los metodos relacionados
 * a Local Repository y asi mantener alta la cohesion de la clase Repository.
 * @author David Ramirez
 *
 */
public class LocalRepository extends Repository{
	
	//METODOS
	/** 
	 * Metodo que se encarga de anadir los Commits del Local Repository a Remote Repository 
	 * @param rep - Repository en el que se haran los cambios
	 * @return Lista enlazada con los cambios realizados en Remote Repository
	 */
	public static LinkedList<Commit> gitPush (Repository rep){
		LinkedList<Commit> commitsRemote = new LinkedList<Commit>();
	
  	    commitsRemote.addAll(rep.getLocalRepository());
  	    
        return commitsRemote;
	}
	
}
