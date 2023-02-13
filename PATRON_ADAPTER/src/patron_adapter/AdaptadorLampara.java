/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_adapter;

/**
 *
 * @author rplou
 */
public class AdaptadorLampara implements Conectable{

    private LamparaInglesa lampara = new LamparaInglesa();

    @Override
    public boolean estaEncendida() {
        return lampara.isOn();
    }

    @Override
    public void encender() {
        lampara.on();
    }

    @Override
    public void apagar() {
        lampara.off();
    }


}
