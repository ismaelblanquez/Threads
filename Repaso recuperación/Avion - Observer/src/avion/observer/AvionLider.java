/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avion.observer;

/**
 *
 * @author rplou
 */
public class AvionLider extends Avion {
    
    public AvionLider(String nombre) {
        super(nombre);
    }
    
    @Override
    public void run(){
        super.girarDerecha();
        super.girarIzquierda();
    }
}
