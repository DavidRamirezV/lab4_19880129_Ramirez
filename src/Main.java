import java.util.LinkedList;
import java.util.Scanner;

import modelo.Archivo;
import modelo.Repository;
import vista.*;


/**Clase Main que se encarga de ejecutar el resto del programa
 * @author David Ramirez
 *
 */
public class Main {
	//Scanner sirve para recoger texto por consola
	static Scanner input = new Scanner(System.in); 
	static int seleccion = -1; //opción elegida del usuario
	static LinkedList<Archivo> Archivos = new LinkedList<Archivo>();
	static Repository repositorio = new Repository() {};
	
	
	/**main inicia el programa
	 * @param args
	 */
	public static void main(String[] args) {
		Menu.iniciarMenu(input,seleccion,Archivos,repositorio);
	}
}
