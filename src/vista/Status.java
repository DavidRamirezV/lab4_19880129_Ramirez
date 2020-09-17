package vista;

import modelo.*;

/** Esta clase representa a gitStatus, es parte del package vista debido a que solo se utilizara
 * para imprimir por consola el estado actual de un repositorio
 * mostrando: 
 * (i) Información del repositorio (nombre y autor)
 * (ii) Número de archivos en el Workspace
 * (iii) Número de archivos en el Index
 * (iv) Número de commits en el Local Repository
 * (v) SI el Remote Repository está al día (o no) con los cambios del Local Repository.
 * @author David Ramirez
 *
 */
public class Status{
	
    /**Metodo que imprime por consola el estado actual de un repositorio
 	 * mostrando: 
 	 * (i) Información del repositorio (nombre y autor)
 	 * (ii) Número de archivos en el Workspace
 	 * (iii) Número de archivos en el Index
 	 * (iv) Número de commits en el Local Repository
 	 * (v) SI el Remote Repository está al día (o no) con los cambios del Local Repository.
	 * @param rep - Repository que sera imprimido por pantalla
	 */
	public static void gitStatus(Repository rep) {

		System.out.println("############ STATUS ############");
		System.out.println("Autor: " + rep.getAutor());
		System.out.println("Nombre Repositorio: " + rep.getNombreRep());
		System.out.println("Rama: " + rep.getRama());
		System.out.println("Fecha de creacion: " + rep.getFecha());
		
		System.out.println("---------WORKSPACE-----------");
		
		if(rep.getWorkspace() == null || rep.getWorkspace().size() == 0){
			System.out.println("Cantidad de Archivos: 0");		    
		}
		else {
			System.out.println("Cantidad de Archivos: " + rep.getWorkspace().size());
			for (int i=0; i<rep.getWorkspace().size();i++) {
	    		System.out.println(rep.getWorkspace().get(i).getNombre());
	    	}
		}
		
	    System.out.println("-----------INDEX--------------");
	    
	    if(rep.getIndex() == null || rep.getIndex().size() == 0){
	    	System.out.println("Cantidad de Archivos: 0");
	    	
	    }
	    else {
	    	System.out.println("Cantidad de Archivos: " + rep.getIndex().size());
	    	for (int i=0; i<rep.getIndex().size();i++) {
	    		System.out.println(rep.getIndex().get(i).getNombre());
	    	}
	    }
	    
	    System.out.println("-------LOCAL REPOSITORY-------");
	    
	    if(rep.getLocalRepository() == null || rep.getLocalRepository().size() == 0){
	    	System.out.println("Cantidad de Commits: 0");
	    }
	    else {
	    	System.out.println("Cantidad de Commits: " + rep.getLocalRepository().size());
	    	for (int i=0; i<rep.getLocalRepository().size();i++) {
	    		System.out.println(rep.getLocalRepository().get(i).getComentario());
	    	}
	    }
	    
	    System.out.println("------REMOTE REPOSITORY-------");
	    if(rep.getRemoteRepository() == null || rep.getRemoteRepository().size() == 0){
	    	System.out.println("Cantidad de Commits: 0");
	    }
	    else {
	    	System.out.println("Cantidad de Commits: " + rep.getRemoteRepository().size());
	    	for (int i=0; i<rep.getRemoteRepository().size();i++) {
	    		System.out.println(rep.getRemoteRepository().get(i).getComentario());
	    	}
	    }
	    if (Commit.listasIguales(rep.getLocalRepository(),rep.getRemoteRepository())){
	    	System.out.println("Remote Repository esta al dia");
	    }
	    else {
	    	System.out.println("Remote Repository NO esta al dia");
	    }
	    
	    System.out.println("################################"+System.lineSeparator());
	    
		   
	
	}
	
	
}
