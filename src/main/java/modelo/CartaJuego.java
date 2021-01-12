package modelo;

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
public class CartaJuego implements Serializable{
    private Carta carta;
    private boolean marcada;     
    
    public CartaJuego(Carta carta, boolean marcada){
        this.carta = carta;
        this.marcada = marcada;
        
    }
    
    public void marcarCarta(){}
}
