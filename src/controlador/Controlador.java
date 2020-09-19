/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.*;
import javax.swing.JOptionPane;
import modelo.*;
import vista.InfoRepositorio;
import vista.Menu;

/**
 *
 * @author Dave
 */
public class Controlador implements ActionListener{

    private InfoRepositorio vista;
    private Menu vista2;
    private Repository repositorio;


    /**
     *Constructor
     */
    public Controlador (){
    }
    
    /**
     *Constructor de un controlador
     * @param vista
     * @param repositorio
     */
    public Controlador (InfoRepositorio vista, Repository repositorio){
        this.vista = vista;
        this.repositorio = repositorio;
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
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //GIT INIT
        if (e.getSource()==vista.BotonIniciar){
            this.repositorio = Repository.gitInit(vista.TxtAutor.getText(),vista.TxtNombreRep.getText());
            iniciarMenu(); 
            
        }
        //MENU
        if (e.getSource()==vista2.BotonArchivo){            
            JOptionPane.showMessageDialog(vista2, "hola");
        }
        if (e.getSource()==vista2.BotonAdd){            
            JOptionPane.showMessageDialog(vista2, "hola2");
        }
        if (e.getSource()==vista2.BotonCommit){            
            JOptionPane.showMessageDialog(vista2, "hola3");
        }
        if (e.getSource()==vista2.BotonPush){   
           
        }
        if (e.getSource()==vista2.BotonPull){                
        }
        if (e.getSource()==vista2.BotonStatus){        
        }
        
    }
    
    
}
