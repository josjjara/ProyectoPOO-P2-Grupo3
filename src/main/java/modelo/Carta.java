/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Jose
 */
public class Carta implements Serializable {
    private String nombre;
    private String ruta;
    private boolean marcada;
    private int indice;
    
    public Carta(String nombre,String ruta,int indice){
        this.nombre= nombre;
        this.ruta = ruta;
        this.indice = indice;
        marcada=false;
    }
    public void marcarCarta(){
            marcada = true;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public boolean estaMarcada() {
        return marcada;
    }

    public int getIndice() {
        return indice;
    }
    public void setIndice(int ind){
        indice =ind;
    }
    @Override
        public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (!this.nombre.equals(other.nombre)) {
            return false;
        }
        return true;
    }
    
    
}
