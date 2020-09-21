package modelo;

import java.util.LinkedList;
import java.util.List;

/**
 * Clase que hereda de Repository que representa la zona de trabajo Workspace, se utliza para implementar los metodos relacionados
 * a Workspace y asi mantener alta la cohesion de la clase Repository.
 * @author David Ramirez
 *
 */
public class Workspace extends Repository{
	
	//METODOS
	/**Metodo que se utliza para filtrar los archivos de Workspace que se desean agregar a Index, se pueden anadir n archivos o
	 * si el usuario lo desea puede agregar todos los archivos que esten en Workspace.
	 * @param nombreArchivos - Lista de Strings con los nombres de Archivos que se desean agregar, si el valor en el indice 0
	 * 							es "all" se agregaran todos los archivos ubicados en Workspace a Index
	 * @param workspace - Lista enlazada de Archivos que representa a Workspace
	 * @return lista enlazada de archivos con los archivos que se desean agregar a Index
	 */
	public static LinkedList<Archivo> gitAdd (List<String> nombreArchivos, LinkedList<Archivo> workspace) {
		LinkedList<Archivo> coincidencias= new LinkedList<Archivo>() ; 
		
		//si se quiere agregar todo (all)
		if (nombreArchivos.get(0).equals("all")) {
			for(int i=0;i < workspace.size();i++) {
				coincidencias.add(workspace.get(i));		
			}
		}
		//si la lista no esta vacia agregar la lista de nombres entregados
		else {		
			for(int i=0;i < nombreArchivos.size();i++) {
				for(int j=0;j < workspace.size();j++) {
				    if (nombreArchivos.get(i).equals(workspace.get(j).getNombre())) {
				    	coincidencias.add(workspace.get(j));
				    }
				}
			}				
		}
		return coincidencias;
	}
	
	
}
