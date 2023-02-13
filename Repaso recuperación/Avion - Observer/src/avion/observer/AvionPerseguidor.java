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
public class AvionPerseguidor implements IAvion{
    
    private String nombre;

    public AvionPerseguidor(String nombre) {
        this.nombre = nombre;
        System.out.println("Avion perseguidor " + this.nombre + " creado");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void girarDerecha() {
        System.out.println("Avion " + this.getNombre() + " girando a la derecha");
    }

    @Override
    public void girarIzquierda() {
        System.out.println("Avion " + this.getNombre() + " girando a la izquierda");
    }
    
}
