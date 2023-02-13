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
public class Builder_Singleton_Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cocina cocina = Cocina.getInstance();

        PizzaBuilder hawaianPizza = Pizza_Factory.getInstance(Pizza_Factory.HAWAII_PIZZA_BUILDER);
        PizzaBuilder picantePizza = Pizza_Factory.getInstance(Pizza_Factory.PICANTE_PIZZA_BUILDER);

        cocina.setPizzaBuilder(picantePizza);
        cocina.construirPizza();
        System.out.println("Pizza picante construida");

        cocina.setPizzaBuilder(hawaianPizza);
        cocina.construirPizza();
        System.out.println("Pizza hawaiana construida");
        
    }

}
