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
public class LamparaInglesa {
    private boolean isOn;
    
    public void on(){
        isOn = true;
    }
    
    public void off(){
        isOn = false;
    }
    
    public boolean isOn(){
        return isOn;
    }
}
