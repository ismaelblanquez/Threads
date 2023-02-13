/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronadapter;

/**
 *
 * @author rplou
 */
public class PatronAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IConectable lampara1 = new Lampara();
        encenderAparato(lampara1);
    }
    
    private static void encenderAparato(IConectable aparato){
        aparato.encender();
        System.out.println("¿Encendido? " + aparato.estaEncendida());
    }
    
}
