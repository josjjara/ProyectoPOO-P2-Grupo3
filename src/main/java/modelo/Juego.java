package modelo;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.Serializable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emily
 */
public class Juego implements Serializable {
    private String fecha;
    private double duracion;
    private ArrayList<Jugador> jugadores;
    private Jugador ganador;
    private Configuracion configuracion;
    private transient Mazo mazo;
    private transient ArrayList<Carta> cartasJugadas;
    private Alineacion alineacion;
    
    public Juego(){
    }
    public Juego(String fecha,double duracion,ArrayList<Jugador> jugadores,
            Configuracion configuracion,
            Alineacion alineacion){
        this.fecha =fecha;
        this.duracion = duracion;
        this.jugadores = jugadores;
        this.configuracion =configuracion;
        this.alineacion = alineacion;
    }
    public String getFecha(){
        return fecha;
    }
    public double getDuracion(){
        return duracion;
    }
    public ArrayList<Jugador> getJugadores(){
        return jugadores;
    }
    public Configuracion getConfiguracion(){
        return configuracion;
    }
    public Alineacion getAlineacion(){
        return alineacion;
    }
    public void verificarTablero(){
        
    }
}
