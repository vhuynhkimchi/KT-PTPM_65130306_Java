package behavioral.chain_of_responsibility.CB1;

public class MainATM {
    public static void main(String[] args) {
        int amount = 293;
        System.out.println("Cau a: Rut tien binh thuong menh gia lon nhat la 500!");
        // Bắt đầu từ chuỗi 500
        MoneyDispenser defaultChain = ATM_Machine.getDispenser(500);
        defaultChain.dispenser(amount);

        System.out.println("Cau b: Rut tien voi menh gia lon nhat duoc chon!");
        MoneyDispenser customChain = ATM_Machine.getDispenser(50);
        if(customChain != null){
            customChain.dispenser(amount);
        }
    }
}
