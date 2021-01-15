package modelo;


import java.io.Serializable;
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
public class Tablero {
    private CartaJuego[] cartasTab = new CartaJuego[16];
    
    public void llenarTablero(ArrayList<Carta> cartas){
        Mazo mz = new Mazo();
        mz.obtenerCarta();
        mz.barajar();
        for (int i = 0; i<16; i++){
            cartasTab[i] = new CartaJuego(mz.getCarta(i), false);
        }
        
    }

}
