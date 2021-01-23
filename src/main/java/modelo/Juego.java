/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.Date;
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
    public Juego(String nombre,Alineacion alineacion,String oponentes,String visible,double duracion){
            Date hoy = new Date();
            fecha = hoy.toString().split(":")[0];
            this.nombreJugador = nombre;
            this.alineacionJuego = alineacion;
            this.oponentes = oponentes;
            this.oponenteVisible = Boolean.valueOf(visible);
            this.duracion = duracion;
        
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
    
    @Override
    public String toString(){
        String linea = fecha+",\t"+duracion+",\t"+nombreJugador+",\t"+oponentes+",\t";
        switch(alineacionJuego){
            case ESQUINAS:
                linea += "Esquinas";
                break;
            case FILA:
                linea += "Fila";
                break;
            case COLUMNA:
                linea += "Columna";
                break;
            case ESQUINAJUNTA:
                linea += "4 Esquina Junta";
                break;
        }
        return linea;
    }
}
