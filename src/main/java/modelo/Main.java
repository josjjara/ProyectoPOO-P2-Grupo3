/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import app.JuegoController;
import java.util.ArrayList;
import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author emily
 */
public class Main implements Serializable{
    private ArrayList<Juego> juegos;
    private transient ArrayList<Configuracion> configuracion;
    
    public void iniciarJuego(){
        
    }
    public void setJuegos(ArrayList<Juego> arrayJuego){
        juegos = arrayJuego;
    }
    public ArrayList<Juego> getJuegos(){
        return juegos;
    }
    
    public static void generarReporte(){
        Jugador jugadorMain = new Jugador();
        jugadorMain.setNombre("Jose");
        ArrayList<Jugador> jugadoresMain = new ArrayList<>();
        jugadoresMain.add(jugadorMain);
        Configuracion configPrueba = new Configuracion(1,true);
        Juego juegoPrueba = new Juego(
                "14/1/2021",
                4.3,
                jugadoresMain,
                configPrueba,
                Alineacion.ESQUINA
        );
        Main prueba = new Main();
        ArrayList<Juego> juegosArray = new ArrayList<>();
        juegosArray.add(juegoPrueba);
        prueba.juegos = juegosArray;
        try{
            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("data\\reporte.ser"));
            file.writeObject(prueba);
        }catch(IOException e){
            System.out.println("No se pudo completar");
            e.printStackTrace();
        }
        
    }
}
