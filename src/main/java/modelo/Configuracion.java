/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
/*
 *
 * @author emily
 */
public class Configuracion {
    private boolean visible;
    private int numOponentes;
    
    public Configuracion(int numOponentes, boolean visible){
        this.numOponentes = numOponentes;
        this.visible = visible;    
    }
}
