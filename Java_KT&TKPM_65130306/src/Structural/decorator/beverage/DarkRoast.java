package Structural.decorator.beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(String description) {
        super(description);
    }

    //Lớp đồ uống cụ thể vaf số tiền gốc là 20
    @Override
    public int cost() {
        return 20;
    }
}
