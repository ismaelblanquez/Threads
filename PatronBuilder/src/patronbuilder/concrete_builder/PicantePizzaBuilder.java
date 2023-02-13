
package patronbuilder.concrete_builder;

import patronbuilder.abstract_builder.PizzaBuilder;

public class PicantePizzaBuilder extends PizzaBuilder{

    @Override
    public void buildMasa() {
        super.pizza.setMasa("doble");
    }

    @Override
    public void buildSalsa() {
        super.pizza.setSalsa("Carbonara+picante");
    }

    @Override
    public void buildRelleno() {
        super.pizza.setRelleno("pepperoni+beicon+jalapenyos");
    }
    
}
