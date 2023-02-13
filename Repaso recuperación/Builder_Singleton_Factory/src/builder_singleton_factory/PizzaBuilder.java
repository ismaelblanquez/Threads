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
public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }
    
    public void crearPizza(){
        this.pizza = new Pizza();
    }
    
    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
    
}
