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

public class Tablero {
    private ArrayList<Carta> mazo;
    private ArrayList<Carta> tablero;
    public Tablero(){
        mazo = new ArrayList<Carta>();
        tablero = new ArrayList<Carta>();
    }
    public void barajarMazo(){
        Collections.shuffle(mazo);}
    
    //metodo de lectura de archivo
    public void obtenerMazo() {
    //lectura de archivo cartasloteria.csv
            try {
                //se crea un buffered reader
                FileReader fr1 = new FileReader("data\\cartasloteria.csv");
                BufferedReader br1 = new BufferedReader(fr1);

                //String ruta = "src/main/resources/images.deck/";
                String linea;
                int cont=1;
                while ((linea = br1.readLine()) != null) {
                    // para cada linea se crea una lista de Strings que se usaran para crear el producto y añadirlo al arreglo
                    String ruta = "images\\deck\\"+String.valueOf(cont)+".png";
                    String[] dato = linea.split(",");
                    int dato0 = Integer.parseInt(dato[0]);
                    mazo.add( new Carta (dato[1],ruta,dato0));
                    cont++;
                }
            } catch (IOException e) {
                e.printStackTrace(); }
            }
    public Carta getCarta(int i){
        return mazo.get(i);
    }
    public ArrayList<Carta> getMazo(){
        return mazo;
    }
    public ArrayList<Carta> getTablero(){
        return tablero;
    }    
        public boolean chequearTablero(Alineacion alineacion){
        switch(alineacion){
            case ESQUINAS:
                if(tablero.get(0).estaMarcada()&&
                   tablero.get(3).estaMarcada()&&
                   tablero.get(12).estaMarcada()&&
                   tablero.get(15).estaMarcada()){
                    return true;
                }
                break;
            case FILA:
                for(int i=0;i<17;i+=4){
                    if(tablero.get(i).estaMarcada()&&
                       tablero.get(i+1).estaMarcada()&&
                       tablero.get(i+2).estaMarcada()&&
                       tablero.get(i+3).estaMarcada()){
                        return true;
                    }        
                }
                break;
            case COLUMNA:
                for(int i=0;i<4;i++){
                    if(
                       tablero.get(i).estaMarcada()&&
                       tablero.get(i+4).estaMarcada()&&
                       tablero.get(i+8).estaMarcada()&&
                       tablero.get(i+12).estaMarcada()){
                        return true;
                    }
                }
                break;
            case ESQUINAJUNTA:
                //Indices de las esquinas
                ArrayList<Integer[]> indices = new ArrayList<>();
                Integer[] esquina1 = new Integer[4];
                esquina1[0]=0;esquina1[1]=1;esquina1[2]=4;esquina1[3]=5;
                Integer[] esquina2 = new Integer[4];
                esquina2[0]=2;esquina2[1]=3;esquina2[2]=6;esquina2[3]=7;
                Integer[] esquina3 = new Integer[4];
                esquina3[0]=8;esquina3[1]=9;esquina3[2]=12;esquina3[3]=13;
                Integer[] esquina4 = new Integer[4];
                esquina4[0]=10;esquina4[1]=11;esquina4[2]=14;esquina4[3]=15;                
                for(Integer[] lista: indices){
                    if(
                       tablero.get(lista[0]).estaMarcada()&&
                       tablero.get(lista[1]).estaMarcada()&&
                       tablero.get(lista[2]).estaMarcada()&&
                       tablero.get(lista[3]).estaMarcada()){
                        return true;
                    }
                }  
                break;
        }
        return false;
    }

}
    

            