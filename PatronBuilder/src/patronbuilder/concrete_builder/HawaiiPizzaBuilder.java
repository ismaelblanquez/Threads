
package patronbuilder.concrete_builder;

import patronbuilder.abstract_builder.PizzaBuilder;

public class HawaiiPizzaBuilder extends PizzaBuilder{

    @Override
    public void buildMasa() {
        super.pizza.setMasa("suave");
    }

    @Override
    public void buildSalsa() {
        super.pizza.setSalsa("dulce");
    }

    @Override
    public void buildRelleno() {
        super.pizza.setRelleno("pinya+york+shitake");
    }
    
}
