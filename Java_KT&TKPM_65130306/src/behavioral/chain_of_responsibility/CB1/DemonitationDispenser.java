package behavioral.chain_of_responsibility.CB1;


public class DemonitationDispenser extends MoneyDispenser{
    private int demonitation;
    public DemonitationDispenser(int demonitation) {
        this.demonitation = demonitation;
    }
    @Override
    public void dispenser(int amount) {
        if(amount >= demonitation){
            int count = amount / demonitation;
            int remainder = amount % demonitation;
            System.out.println("- " +count+"to menh gia"+demonitation);
            if(remainder!=0 && nextDispenser != null){
                nextDispenser.dispenser(remainder);
            }
            else if(remainder!=0){
                System.out.println("Loi khong the chi tra so tien con lai la: " + remainder);
            }
        }
        else if(nextDispenser != null){
            nextDispenser.dispenser(amount);
        }
    }
}
