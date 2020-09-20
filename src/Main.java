import controlador.Controlador;
import java.util.LinkedList;

import modelo.Archivo;
import modelo.Repository;
import vista.*;


/**Clase Main que se encarga de ejecutar el resto del programa
 * @author David Ramirez
 *
 */
public class Main {
    
	/**main inicia el programa
	 * @param args
	 */
       
        
         public static void main(String args[]) {
             
	LinkedList<Archivo> Archivos = new LinkedList<Archivo>();
	Repository repositorio = new Repository() {};
	InfoRepositorio vista1 = new InfoRepositorio();
	Controlador control = new Controlador(vista1,repositorio,Archivos);
        
        
        control.iniciar();
        /*
            Menu.iniciarMenu(input,seleccion,Archivos,repositorio);
        */
                
        
        }
    
}
