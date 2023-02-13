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
public class Lampara implements IConectable{
    private boolean encendida;

    @Override
    public void encender() {
        encendida = true;
    }

    @Override
    public void apagar() {
        encendida = false;
    }

    @Override
    public boolean estaEncendida() {
        return encendida;
    }
}
