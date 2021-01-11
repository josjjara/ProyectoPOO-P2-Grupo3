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

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> cartas;


public void barajar(){
    Collections.shuffle(cartas);}

public void mostrarCarta(){
    for(Carta c: cartas){
       System.out.println(c);} }
}