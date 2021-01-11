/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.*;
/**
 *
 * @author emily
 */
public class Carta implements Serializable{
    private int numero;
    private String nombre;
    private String rutaImagen;
    
    public Carta(int numero,String nombre,String rutaImagen){
        this.numero = numero;
        this.nombre = nombre;
        this.rutaImagen = rutaImagen;
    }
    
    
    public int getNumero(){
        return numero;
    }
    
    public String getNombre(){
        return nombre;
    }
    

}

