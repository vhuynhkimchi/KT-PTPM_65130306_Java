package Structural.decorator.beverage;

public class mainDecorator {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast("Cafe Highland");
        System.out.println(beverage.getDescription());
        beverage = new Milk("Sua tuoi", beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
        beverage = new Milk("Sua dac", beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
