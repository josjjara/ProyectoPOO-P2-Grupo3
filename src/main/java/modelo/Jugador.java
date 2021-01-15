/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.Serializable;
/**
 *
 * @author emily
 */
public class Jugador implements Serializable{
    private String nombre;
    private Tablero tablero;
    
    public Jugador(){
    }
    
    public Jugador(String nombre, Tablero tablero){
        this.nombre = nombre;
        this.tablero = tablero;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    public String getNombre(){
        return nombre;
    }
}
