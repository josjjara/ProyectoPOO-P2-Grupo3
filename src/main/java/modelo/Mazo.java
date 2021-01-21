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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> cartas;


    public void barajar(){
        Collections.shuffle(cartas);}

    public void mostrarCarta(){
        for(Carta c: cartas){
           System.out.println(c);} }
    

    
    //metodo de lectura de archivo
    public void obtenerCarta() {
    //lectura de archivo cartasloteria.csv
            try {
                //se crea un buffered reader
                FileReader fr1 = new FileReader("src\\main\\resources\\cartasL\\cartasloteria.csv");
                BufferedReader br1 = new BufferedReader(fr1);

                //String ruta = "src/main/resources/images.deck/";
                String linea;
                int cont=1;
                while ((linea = br1.readLine()) != null) {
                    // para cada linea se crea una lista de Strings que se usaran para crear el producto y añadirlo al arreglo
                    String ruta = "src\\main\\resources\\images\\deck\\"+String.valueOf(cont)+".png";
                    String[] dato = linea.split(",");
                    int dato0 = Integer.parseInt(dato[0]);
                    cartas.add( new Carta (dato0,dato[1],ruta));
                    cont++;
                }
            } catch (IOException e) {
                e.printStackTrace(); }
            }
    public Carta getCarta(int i){
        return cartas.get(i);
    }
}
    

            