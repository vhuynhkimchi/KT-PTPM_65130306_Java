package creational.factory.pizza;

import creational.factory.pizza.vietnam.VietNamPizzaStore;

public class MainPizza {
    public static void main(String[] args){
        PizzaStore store = new VietNamPizzaStore();
        Pizza p = store.orderPizza(PizzaType.HAISAN);
        System.out.println(p.toString());
    }
}
