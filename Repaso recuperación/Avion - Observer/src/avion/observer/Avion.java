/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avion.observer;

import java.util.ArrayList;

/**
 *
 * @author rplou
 */
public abstract class Avion extends Thread implements IAvion {
    
    private String nombre;
    private ArrayList<IAvion> aviones = new ArrayList<IAvion>();

    public Avion(String nombre) {
        this.nombre = nombre;
        System.out.println("Avion " + this.nombre + " creado");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarAvion(IAvion a){
        aviones.add(a);
    }
    
    public void eliminarAvion(IAvion a){
        aviones.remove(a);
    }
        
    @Override
    public void girarDerecha() {
        System.out.println("El avion " + this.getNombre() + " está girando a la derecha");
        
        for (IAvion avion : aviones) {
            avion.girarDerecha();
        }
    }

    @Override
    public void girarIzquierda() {
        System.out.println("El avion " + this.getNombre() + " está girando a la izquierda");
        
        for (IAvion avion : aviones) {
            avion.girarIzquierda();
        }
    }
    
}
