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
public class AvionObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AvionLider avionLider = new AvionLider("Avion Lider");
        
        AvionPerseguidor avionPerseguidor1 = new AvionPerseguidor("AP1");
        AvionPerseguidor avionPerseguidor2 = new AvionPerseguidor("AP2");
        AvionPerseguidor avionPerseguidor3 = new AvionPerseguidor("AP3");
        
        avionLider.agregarAvion(avionPerseguidor1);
        avionLider.agregarAvion(avionPerseguidor2);
        avionLider.agregarAvion(avionPerseguidor3);
        
        avionLider.start();
        
    }
    
}
