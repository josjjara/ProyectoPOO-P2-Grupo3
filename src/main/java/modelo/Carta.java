/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.*;
import java.util.Objects;
/**
 *
 * @author emily
 */
public class Carta {
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
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        } else{
            return true;
        }
    }

}

