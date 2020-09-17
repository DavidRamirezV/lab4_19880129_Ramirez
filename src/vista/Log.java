package vista;

import java.util.Collections;
import java.util.LinkedList;
import modelo.Commit;

/**
 * Clase Log tiene el metodo gitLog utilizado para mostrar una lista con los últimos 5 commits del 
 * Local Repository (indicando fecha, mensaje descriptivo y archivos añadidos). Si hay 
 * menos de 5 commits, muestra todos los que estén disponibles.
 * @author David Ramirez
 *
 */
public class Log {
	
	//METODOS
	/*** Esta funcionalidad debe mostrar una lista con los últimos 5 commits del 
	 * Local Repository (indicando fecha, mensaje descriptivo y archivos añadidos). Si hay 
	 * menos de 5 commits, muestra todos los que estén disponibles.
	 * @param localRepository - lista enlazada de commit que representa al local repository
	 */
	public static void gitLog(LinkedList<Commit> localRepository) {
		LinkedList<Commit> auxiliar = new LinkedList<Commit>();
		auxiliar.addAll(localRepository);
		Collections.reverse(auxiliar);
		while(auxiliar.size()>5) {
			auxiliar.removeLast();
		}
		for (int i=0;i<auxiliar.size();i++) {
			System.out.println("############################");
			System.out.println("Mensaje Descriptivo: " + auxiliar.get(auxiliar.size()-1-i).getComentario());
			System.out.println("Fecha del commit: " + auxiliar.get(auxiliar.size()-1-i).getFecha());
			System.out.println("Archivos editados en este commit: ");
			for (int j=0;j<auxiliar.get(auxiliar.size()-1-i).getArchivosEditados().size();j++) {
				System.out.println(auxiliar.get(auxiliar.size()-1-i).getArchivosEditados().get(j).getNombre());
			}
		}	
		System.out.println("############################"+System.lineSeparator());
		
	}
}