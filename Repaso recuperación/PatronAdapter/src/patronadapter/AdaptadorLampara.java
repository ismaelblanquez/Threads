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
public class AdaptadorLampara implements IConectable{
    private LamparaInglesa lampara = new LamparaInglesa();

    @Override
    public void encender() {
        lampara.on();
    }

    @Override
    public void apagar() {
        lampara.off();
    }

    @Override
    public boolean estaEncendida() {
        return lampara.isOn();
    }
}
