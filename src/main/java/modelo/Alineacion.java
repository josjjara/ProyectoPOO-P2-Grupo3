/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Random;
import java.io.Serializable;
/**
 *
 * @author Jose
 */
public enum Alineacion implements Serializable {
    ESQUINAS,
    FILA,
    COLUMNA,
    ESQUINAJUNTA;
    
        public static Alineacion generarAlineacion() {
            Alineacion[] values = Alineacion.values();
            int length = values.length;
            int randIndex = new Random().nextInt(length);
            return values[randIndex];
        }
    
}
