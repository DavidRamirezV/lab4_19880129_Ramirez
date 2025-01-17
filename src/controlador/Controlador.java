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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
    private StatusWorkspaceIndex status1;
    private StatusLocalRemote status2;


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
        vista2.setLocationRelativeTo(null);
        vista2.setVisible(true);        
        vista.setSize(655, 500);
        vista2.jPanel1.setVisible(false);
        vista2.autor.setText(vista.TxtAutor.getText());
        vista2.nombreRep.setText(vista.TxtNombreRep.getText());
        vista2.BotonArchivo.addActionListener(this);
        vista2.BotonAdd.addActionListener(this);
        vista2.BotonCommit.addActionListener(this);
        vista2.BotonPush.addActionListener(this);
        vista2.BotonPull.addActionListener(this);
        vista2.BotonStatus.addActionListener(this);
        vista2.StatusWorkspace.addActionListener(this);
        vista2.StatusIndex.addActionListener(this);
        vista2.StatusLocal.addActionListener(this);
        vista2.StatusRemote.addActionListener(this);
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
            String nombre = (String) JOptionPane.showInputDialog(null, "Ingresa el nombre del archivo","Crear Archivo", -1,null, null, "ejemplo.txt");          
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
                String archivosAgregar = (String) JOptionPane.showInputDialog(null, "Escribe all para agregar todo o ingresa los nombres de los archivos separados por comas","¿Que Quieres Agregar?", -1, null, null, "all");          
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
                String mensaje = (String) JOptionPane.showInputDialog(null, "Ingresa un mensaje descirptivo para el Commit","Git Commit", -1, null, null, "mensaje");          
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
        if (e.getSource()==vista2.StatusWorkspace){    
            status1 = new StatusWorkspaceIndex();
            status1.setTitle("Simulacion de Git por David Ramirez");
            status1.setLocation(vista.getLocation());
            status1.Donde.setText("Workspace:");
            if (Archivos.size()>0){
                for (int i=0;Archivos.size()>i;i++){
                   status1.modelo.addElement(Archivos.get(i).getNombre());                   
                   status1.ListaArchivos.setSelectedIndex(0);
                }
                status1.Contenido.setText(Archivos.getFirst().getContenido());
            }
            status1.ListaArchivos.addListSelectionListener(new ListSelectionListener() {
            @Override
                public void valueChanged(ListSelectionEvent e) {
                    status1.Contenido.setVisible(false);
                    String seleccionado = status1.ListaArchivos.getSelectedValue();
                    for (int i=0;Archivos.size()>i;i++){
                        if (Archivos.get(i).getNombre().equals(seleccionado)){
                            status1.Contenido.setText(Archivos.get(i).getContenido());
                            status1.Contenido.setVisible(true);
                            break;
                        }
                    }
                   
                }            
            });
            status1.setVisible(true);            
        }    
       
       if (e.getSource()==vista2.StatusIndex){ 
            status1 = new StatusWorkspaceIndex();
            status1.setTitle("Simulacion de Git por David Ramirez");
            status1.setLocation(vista.getLocation());
            status1.Donde.setText("Index:");
            
            try{
                if (repositorio.getIndex().size()>0){
                    for (int i=0;repositorio.getIndex().size()>i;i++){
                       status1.modelo.addElement(repositorio.getIndex().get(i).getNombre());                   
                       status1.ListaArchivos.setSelectedIndex(0);
                    }
                    status1.Contenido.setText(repositorio.getIndex().getFirst().getContenido());
                }
                status1.ListaArchivos.addListSelectionListener(new ListSelectionListener() {
                @Override
                    public void valueChanged(ListSelectionEvent e) {
                        status1.Contenido.setVisible(false);
                        String seleccionado = status1.ListaArchivos.getSelectedValue();
                        for (int i=0;repositorio.getIndex().size()>i;i++){
                            if (repositorio.getIndex().get(i).getNombre().equals(seleccionado)){
                                status1.Contenido.setText(repositorio.getIndex().get(i).getContenido());
                                status1.Contenido.setVisible(true);
                                break;
                            }
                        }

                    }            
                });            
                status1.setVisible(true);  
            }catch (Exception l){
                status1.setVisible(true); 
            }
            
        }   
        
       if (e.getSource()==vista2.StatusLocal){ 
            status2 = new StatusLocalRemote();
            status2.setTitle("Simulacion de Git por David Ramirez");
            status2.setLocation(vista.getLocation());
            status2.Donde.setText("Local Repository:");    
            try{
                
                if (repositorio.getLocalRepository().size()>0){
                    status2.CantidadCommits.setText(Integer.toString(repositorio.getLocalRepository().size()));
                    for (int i=repositorio.getLocalRepository().size()-1;i>=0;i--){
                       status2.modelo.addElement(repositorio.getLocalRepository().get(i).getFecha()+ "  |  " +repositorio.getLocalRepository().get(i).getComentario());                   
                       status2.ListaCommits.setSelectedIndex(0);
                    }
                    status2.mensaje.setText(repositorio.getLocalRepository().getLast().getComentario());
                    status2.fechaCommit.setText(repositorio.getLocalRepository().getLast().getFecha());
                    for (int i=0; i<repositorio.getLocalRepository().getLast().getArchivosEditados().size();i++){
                        status2.modelo1.addElement(repositorio.getLocalRepository().getLast().getArchivosEditados().get(i).getNombre());
                    }
                    
                }
                status2.ListaCommits.addListSelectionListener(new ListSelectionListener() {
                @Override
                    public void valueChanged(ListSelectionEvent e) {
                        status2.mensaje.setVisible(false);
                        status2.fechaCommit.setVisible(false);    
                        status2.ListaEditados.setVisible(false);
                        status2.modelo1.clear();
                        int seleccionado = status2.ListaCommits.getSelectedIndex();
                        status2.mensaje.setText(repositorio.getLocalRepository().get(repositorio.getLocalRepository().size()-seleccionado-1).getComentario());
                        status2.fechaCommit.setText(repositorio.getLocalRepository().get(repositorio.getLocalRepository().size()-seleccionado-1).getFecha());
                        for (int i=0; i<repositorio.getLocalRepository().get(repositorio.getLocalRepository().size()-seleccionado-1).getArchivosEditados().size();i++){
                            status2.modelo1.addElement(repositorio.getLocalRepository().get(repositorio.getLocalRepository().size()-seleccionado-1).getArchivosEditados().get(i).getNombre());
                        }
                        status2.mensaje.setVisible(true);
                        status2.fechaCommit.setVisible(true);
                        status2.ListaEditados.setVisible(true);
                    }            
                });  
                status2.setVisible(true);
                }
                catch (Exception l){

                    status2.setVisible(true);
                }
        }
       
        if (e.getSource()==vista2.StatusRemote){ 
            status2 = new StatusLocalRemote();
            status2.setTitle("Simulacion de Git por David Ramirez");
            status2.setLocation(vista.getLocation());
            status2.Donde.setText("Remote Repository:");    
            try{
                
                if (repositorio.getRemoteRepository().size()>0){
                    status2.CantidadCommits.setText(Integer.toString(repositorio.getRemoteRepository().size()));
                    for (int i=repositorio.getRemoteRepository().size()-1;i>=0;i--){
                       status2.modelo.addElement(repositorio.getRemoteRepository().get(i).getFecha()+ "  |  " +repositorio.getRemoteRepository().get(i).getComentario());                   
                       status2.ListaCommits.setSelectedIndex(0);
                    }
                    status2.mensaje.setText(repositorio.getRemoteRepository().getLast().getComentario());
                    status2.fechaCommit.setText(repositorio.getRemoteRepository().getLast().getFecha());
                    for (int i=0; i<repositorio.getRemoteRepository().getLast().getArchivosEditados().size();i++){
                        status2.modelo1.addElement(repositorio.getRemoteRepository().getLast().getArchivosEditados().get(i).getNombre());
                    }
                    
                }
                status2.ListaCommits.addListSelectionListener(new ListSelectionListener() {
                @Override
                    public void valueChanged(ListSelectionEvent e) {
                        status2.mensaje.setVisible(false);
                        status2.fechaCommit.setVisible(false);    
                        status2.ListaEditados.setVisible(false);
                        status2.modelo1.clear();
                        int seleccionado = status2.ListaCommits.getSelectedIndex();
                        status2.mensaje.setText(repositorio.getRemoteRepository().get(repositorio.getRemoteRepository().size()-seleccionado-1).getComentario());
                        status2.fechaCommit.setText(repositorio.getRemoteRepository().get(repositorio.getRemoteRepository().size()-seleccionado-1).getFecha());
                        for (int i=0; i<repositorio.getRemoteRepository().get(repositorio.getRemoteRepository().size()-seleccionado-1).getArchivosEditados().size();i++){
                            status2.modelo1.addElement(repositorio.getRemoteRepository().get(repositorio.getRemoteRepository().size()-seleccionado-1).getArchivosEditados().get(i).getNombre());
                        }
                        status2.mensaje.setVisible(true);
                        status2.fechaCommit.setVisible(true);
                        status2.ListaEditados.setVisible(true);
                    }            
                });  
                status2.setVisible(true);
                }
                catch (Exception l){

                    status2.setVisible(true);
                }
            
            }  
    }
    
}
