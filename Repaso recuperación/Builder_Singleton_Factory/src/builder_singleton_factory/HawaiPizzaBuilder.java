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
public class HawaiPizzaBuilder extends PizzaBuilder{

    @Override
    public void buildMasa() {
        super.pizza.setMasa("Fina");
    }

    @Override
    public void buildSalsa() {
        super.pizza.setSalsa("Dulce");
    }

    @Override
    public void buildRelleno() {
        super.pizza.setRelleno("Pinya");
    }
    
}
