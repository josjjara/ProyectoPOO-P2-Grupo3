package modelo;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emily
 */
public class Juego {
    private String fecha;
    private int duracion;
    private ArrayList<Jugador> jugadores;
    private Jugador ganador;
    private Configuracion configuracion;
    private Mazo mazo;
    private ArrayList<Carta> cartasJugadas;
    private Alineacion alineacion;

    /*
    public void obtenerCarta() {
    //lectura de archivo cartasloteria.csv
            try {
                //se crea un buffered reader
                FileReader fr1 = new FileReader("src/main/resources/cartasL/cartasloteria.csv");
                BufferedReader br1 = new BufferedReader(fr1);

                //String ruta = "src/main/resources/images.deck/";
                String linea;
                while ((linea = br1.readLine()) != null) {
                    // para cada linea se crea una lista de Strings que se usaran para crear el producto y añadirlo al arreglo
                    String[] dato = linea.split(",");
                    int dato0 = Integer.parseInt(dato[0]);
                    cartas.add( new Carta (dato0, dato[1]));
                }
            } catch (IOException e) {
                e.printStackTrace(); }
            }
    */

}
