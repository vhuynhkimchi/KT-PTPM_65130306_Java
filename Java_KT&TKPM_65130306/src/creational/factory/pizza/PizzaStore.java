package creational.factory.pizza;

public abstract class PizzaStore {
    public abstract Pizza createPizza(PizzaType type);
    public Pizza orderPizza(PizzaType type){
        var Pizza = createPizza(type);
        Pizza.prepare();
        Pizza.bake();
        Pizza.cut();
        Pizza.box();
        return Pizza;
    }
}
