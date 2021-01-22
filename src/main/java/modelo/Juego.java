/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.Serializable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Jose
 */
public class Juego implements Serializable {
    private transient Tablero tableroPrincipal;
    private String nombreJugador;
    private Alineacion alineacionJuego;
    private String oponentes;
    private boolean oponenteVisible;
    private String fecha;
    private double duracion;
    
    public Juego(){
        
    }
    public void iniciarJuego(){
        
    }
    public void cargarConfiguracion(){
        try(BufferedReader file = new BufferedReader(new FileReader("data/configuracion.txt"))){
            String[] linea = file.readLine().split(",");
            oponentes = linea[0];
            oponenteVisible = Boolean.valueOf(linea[1]);
        }catch(IOException e){
           System.out.println("No se pudo cargar archivo"); 
        }
    }

    public Tablero getTableroPrincipal() {
        return tableroPrincipal;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public Alineacion getAlineacionJuego() {
        return alineacionJuego;
    }

    public String getOponentes() {
        return oponentes;
    }

    public boolean getVisible() {
        return oponenteVisible;
    }

    public String getFecha() {
        return fecha;
    }
    
    
}
