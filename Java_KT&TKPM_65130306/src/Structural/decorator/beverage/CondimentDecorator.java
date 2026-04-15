package Structural.decorator.beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    //gọi constructor để mô tả đối tượng nămd bên trong nó
    public CondimentDecorator(String description, Beverage beverage) {
        super(description);
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    // Nó sẽ gọi hàm tính tiền của đối tượng nămf bên trong đó
    @Override
    public int cost() {
        return beverage.cost();
    }
}
