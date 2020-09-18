/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.*;
import vista.InfoRepositorio;

/**
 *
 * @author Dave
 */
public class Controlador implements ActionListener{

    private InfoRepositorio vista;
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
    } 
    
    public void actionPerformed(ActionEvent e) {
        repositorio.setAutor(vista.TxtAutor.getText());
        repositorio.setNombreRep(vista.TxtNombreRep.getText());
        
    
    }
    
    
}
