package behavioral.chain_of_responsibility.CB3;

public class Main {
    public static void main(String[] args) {
        ElectricityCalculator bac1 = new TierCalculator("Bậc 1 (0-50 kwh)", 50, 1500);
        ElectricityCalculator bac2 = new TierCalculator("Bậc 2 (51-100 kwh)", 50, 1866);
        ElectricityCalculator bac3 = new TierCalculator("Bậc 3 (101-200 kwh)", 100, 2866);
        ElectricityCalculator bac4 = new TierCalculator("Bậc 4 (201-300 kwh)", 100, 3866);
        ElectricityCalculator bac5 = new TierCalculator("Bậc 5 (301-400 kwh)", 100, 3866);
        ElectricityCalculator bac6 = new TierCalculator("Bậc 6 (>400 kwh)", 100, 3866);
        bac1.setNextCalculator(bac2)
                .setNextCalculator(bac3)
                .setNextCalculator(bac4)
                .setNextCalculator(bac5)
                .setNextCalculator(bac6);
        testCalculateBill(bac1,45);
        testCalculateBill(bac1,125);
        testCalculateBill(bac1,555);

    }
    private static void testCalculateBill(ElectricityCalculator chain, int kwh){
        System.out.println("Hoa don cho gia dinh dung " + kwh + " kwh");
        double totalBill = chain.calculatorBill(kwh);
        System.out.println("Tong tien " + totalBill + " vnd");
    }
}
