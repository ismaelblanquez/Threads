/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder_singleton_factory;

/**
 *
 * @author rplou
 */
public class PicantePizzaBuilder extends PizzaBuilder {

    @Override
    public void buildMasa() {
        super.pizza.setMasa("Normal");
    }

    @Override
    public void buildSalsa() {
        super.pizza.setSalsa("Picante");
    }

    @Override
    public void buildRelleno() {
        super.pizza.setRelleno("Pepperoni");
    }
    
}
