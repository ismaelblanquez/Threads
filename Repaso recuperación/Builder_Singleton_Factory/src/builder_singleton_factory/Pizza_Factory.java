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
public class Pizza_Factory {
    public static final int HAWAII_PIZZA_BUILDER = 1;
    public static final int PICANTE_PIZZA_BUILDER = 2;
    
    public static PizzaBuilder getInstance(int pizzaSeleccionada){
        PizzaBuilder pizza = null;
        
        switch (pizzaSeleccionada) {
            case HAWAII_PIZZA_BUILDER:
                pizza = new HawaiPizzaBuilder();
                break;
            case PICANTE_PIZZA_BUILDER:
                pizza = new PicantePizzaBuilder();
                break;
        }
        return pizza;
    }
}
