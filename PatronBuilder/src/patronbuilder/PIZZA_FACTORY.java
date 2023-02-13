    
package patronbuilder;

import patronbuilder.abstract_builder.PizzaBuilder;
import patronbuilder.concrete_builder.HawaiiPizzaBuilder;
import patronbuilder.concrete_builder.PicantePizzaBuilder;

/*********PATRÓN FACTORY*********/
public class PIZZA_FACTORY {
    public static final int HAWAII_PIZZA = 1;
    public static final int PICANTE_PIZZA = 2;
    
    
    public static PizzaBuilder getInstance(int pizzaSelected){
        PizzaBuilder pizza = null;
        switch(pizzaSelected){
            case HAWAII_PIZZA:
                pizza = new HawaiiPizzaBuilder();
                break;
            case PICANTE_PIZZA:
                pizza = new PicantePizzaBuilder();
                break;
            //default o varios case 
        }
        return pizza;
    }
}
