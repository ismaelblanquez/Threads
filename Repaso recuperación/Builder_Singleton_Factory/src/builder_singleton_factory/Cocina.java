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
public class Cocina {
    private static Cocina cocina;

    private Cocina() {
    }
    
    public static Cocina getInstance(){
        if (cocina == null) {
            cocina = new Cocina();
        }
        return cocina;
    }
    
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }
    
    public void construirPizza(){
        this.pizzaBuilder.crearPizza();
        this.pizzaBuilder.buildMasa();
        this.pizzaBuilder.buildSalsa();
        this.pizzaBuilder.buildRelleno();
    }
    
    public Pizza getPizza(){
        return this.pizzaBuilder.getPizza();
    }
    
}
