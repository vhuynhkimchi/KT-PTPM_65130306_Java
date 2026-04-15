package behavioral.chain_of_responsibility.CB3;

public abstract class ElectricityCalculator {
    protected ElectricityCalculator nextCalculator;
    public ElectricityCalculator setNextCalculator(ElectricityCalculator nextCalculator) {
        this.nextCalculator = nextCalculator;
        return this;
    }
    public abstract double calculatorBill(int kwh);
}