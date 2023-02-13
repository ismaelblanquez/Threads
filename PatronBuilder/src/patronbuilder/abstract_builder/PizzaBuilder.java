
package patronbuilder.abstract_builder;

/**
 *
 * @author A10-PC102
 */
public abstract class PizzaBuilder {
    protected Pizza pizza;
    
    public Pizza getPizza(){
        return this.pizza;
    }
    
    public void crearNuevaPizza(){
        this.pizza = new Pizza();
    }
    
    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
    
}
