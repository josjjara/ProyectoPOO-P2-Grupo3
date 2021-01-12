/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
/**
 *
 * @author emily
 */
public class Jugador {
    private String nombre;
    private Tablero tablero;
    
    public Jugador(String nombre, Tablero tablero){
        this.nombre = nombre;
        this.tablero = tablero;
    }
    
    public String getNombre(){
        return nombre;
    }
}
