/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofosrepaso;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rplou
 */
public class Filosofo implements Runnable {

    private Mesa mesa;
    private int comensal;
    private int indiceComensal;

    public Filosofo(Mesa mesa, int comensal) {
        this.mesa = mesa;
        this.comensal = comensal;
        this.indiceComensal = comensal - 1;
    }

    
    @Override
    public void run() {
        while (true) {
            this.pensando();
            this.mesa.cogerTenedores(this.indiceComensal);
            this.comiendo();
            System.out.println("Filosofo " + comensal + " deja de comer, tenedores libres " +
                    (this.mesa.tenedorIzquierda(this.indiceComensal) +1) + ", " + 
                    (this.mesa.tenedorDerecha(this.indiceComensal) +1));
            this.mesa.dejarTenedores(this.indiceComensal);
        }
    }

    public void pensando() {
        System.out.println("Filosofo " + comensal +" pensando");
        try {
            Thread.sleep((long) (Math.random()*4000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void comiendo() {
        System.out.println("Filosofo " + comensal +" comiendo");
        try {
            Thread.sleep((long) (Math.random()*4000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
