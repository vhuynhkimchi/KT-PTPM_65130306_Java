package behavioral.chain_of_responsibility.CB3;

public class TierCalculator extends ElectricityCalculator{
    private String tierName;
    private int capacity;
    private double price;

    public TierCalculator(String tierName, int capacity, double price) {
        this.tierName = tierName;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public double calculatorBill(int kwh) {
        if(kwh <= 0){
            return 0;
        }
        int kwhTo = Math.min(kwh,capacity);
        double cost = kwhTo*price;
        System.out.println("- " + " tinh tien " + kwhTo + " kwh " + price + " = " + cost + " VNĐ");
        int remainMinKwh = kwh - kwhTo;
        if(remainMinKwh > 0 && nextCalculator != null){
            cost += nextCalculator.calculatorBill(kwh);
        }
        return cost;
    }
}
