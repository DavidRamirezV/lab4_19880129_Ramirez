/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import modelo.*;
import vista.*;

/**
 *
 * @author Dave
 */
public class Controlador implements ActionListener{

    private InfoRepositorio vista;
    private Menu vista2;
    private CrearArchivo vista3;
    private Repository repositorio;
    private LinkedList<Archivo> Archivos;


    /**
     *Constructor
     */
    public Controlador (){
    }
    
    /**
     *Constructor de un controlador
     * @param vista
     * @param repositorio
     * @param archivos
     */
    public Controlador (InfoRepositorio vista, Repository repositorio,LinkedList<Archivo> archivos){
        this.vista = vista;
        this.repositorio = repositorio;
        this.Archivos = archivos;
        /*this.vista.BotonIniciar.addActionListener(this);*/
    }
    
    public void iniciar(){
        vista.setTitle("Simulacion de Git por David Ramirez");
        vista.setLocationRelativeTo(null);
        vista.BotonIniciar.addActionListener(this);      
        vista.setVisible(true);
    } 
    public void iniciarMenu(){
        vista2 = new Menu();
        vista2.setTitle("Simulacion de Git por David Ramirez");
        vista2.setLocation(vista.getLocation());
        vista2.setVisible(true);
        vista2.setSize(vista.getSize());
        vista2.jPanel1.setVisible(false);
        vista2.autor.setText(vista.TxtAutor.getText());
        vista2.nombreRep.setText(vista.TxtNombreRep.getText());
        vista2.BotonArchivo.addActionListener(this);
        vista2.BotonAdd.addActionListener(this);
        vista2.BotonCommit.addActionListener(this);
        vista2.BotonPush.addActionListener(this);
        vista2.BotonPull.addActionListener(this);
        vista2.BotonStatus.addActionListener(this);
        vista.setVisible(false);
    } 
    public void crearArchivo(String nombre){
        vista3 = new CrearArchivo();
        vista3.setTitle("Crear archivo " + nombre);
        vista3.setLocation(vista.getLocation());
        vista3.nombreArchivo.setText(nombre);
        CrearArchivo.BotonGuardar.addActionListener(this);
        vista3.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //GIT INIT
        if (e.getSource()==vista.BotonIniciar){
            this.repositorio = Repository.gitInit(vista.TxtAutor.getText(),vista.TxtNombreRep.getText());
            iniciarMenu(); 
            
        }
        //MENU
        if (e.getSource()==vista2.BotonArchivo){          
            String nombre = (String) JOptionPane.showInputDialog(null, "Ingresa el nombre del archivo","Crear Archivo", -1, (Icon) vista2.getIconImage(), null, "ejemplo.txt");          
            crearArchivo(nombre);           
            
        }
        
        if (e.getSource()== CrearArchivo.BotonGuardar){
            Archivo nuevo = new Archivo(vista3.nombreArchivo.getText(),vista3.contenido.getText());
            Archivo.anadirArchivoLista(Archivos, nuevo);					
            repositorio.setWorkspace(Archivos);
            vista3.setVisible(false);
        }

        if (e.getSource()==vista2.BotonAdd){           
            try{
                String archivosAgregar = (String) JOptionPane.showInputDialog(null, "Escribe all para agregar todo o ingresa los nombres de los archivos separados por comas","¿Que Quieres Agregar?", -1, (Icon) vista2.getIconImage(), null, "all");          
                List<String> nombresArchivos = new ArrayList<String>(Arrays.asList(archivosAgregar.split(",")));
                repositorio.setIndex(Workspace.gitAdd(nombresArchivos, repositorio.getWorkspace()) );
                 JOptionPane.showMessageDialog(null, "Has realizado un Git Add correctamente", "Git Add", -1);                   
            }
            catch (Exception l){                
                JOptionPane.showMessageDialog(null, "No puedes realizar Git Add porque Workspace esta vacio", "Error", 0);                   
            }
        }
        
        if (e.getSource()==vista2.BotonCommit){           
            try {
                String mensaje = (String) JOptionPane.showInputDialog(null, "Ingresa un mensaje descirptivo para el Commit","Git Commit", -1, (Icon) vista2.getIconImage(), null, "mensaje");          
                repositorio.setLocalRepository(Index.gitCommit(mensaje,repositorio));
                repositorio.setIndex(null);
                 JOptionPane.showMessageDialog(null, "Has realizado un Git Commit correctamente", "Git Commit", -1);                   
            }
            catch (Exception l){                
                JOptionPane.showMessageDialog(null, "No puedes realizar Git Commit porque Index esta vacio", "Error", 0);                   
            }
        }
        if (e.getSource()==vista2.BotonPush){   
            try {
               repositorio.setRemoteRepository(LocalRepository.gitPush(repositorio));
               JOptionPane.showMessageDialog(null, "Has realizado un Push correctamente", "Git Push", -1);                   
            }
            catch (Exception l){                
                JOptionPane.showMessageDialog(null, "No puedes realizar un Push porque Local Repository esta vacio", "Error", 0);                   
            }           
        }
        
        if (e.getSource()==vista2.BotonPull){     
            try {
                repositorio.setWorkspace(RemoteRepository.gitPull(repositorio));
		Archivos.clear();
		Archivos.addAll(repositorio.getWorkspace());
               JOptionPane.showMessageDialog(null, "Has realizado un Pull correctamente", "Git Pull", -1);                   
            }
            catch (Exception l){                
                JOptionPane.showMessageDialog(null, "No puedes realizar un Pull porque Remote Repository esta vacio", "Error", 0);                   
            }  
        }
        
        if (e.getSource()==vista2.BotonStatus){    
            
            
            
        }
        
    }
    
    
}
