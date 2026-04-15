package behavioral.chain_of_responsibility.CB1;

public class ATM_Machine {
    public static MoneyDispenser getDispenser(int maxDenomination) {
        int [] availableDemonitations = {500,200,50,10,1};
        MoneyDispenser headOfChain = null;
        MoneyDispenser currentDispenser = null;

        for(int demo: availableDemonitations){
            if(demo <= maxDenomination){
                MoneyDispenser newDispenser = new DemonitationDispenser(demo);
                if(headOfChain == null){
                    headOfChain = newDispenser;
                    currentDispenser = headOfChain;
                }
                else{
                    currentDispenser.setNextDispenser(newDispenser);
                    currentDispenser = newDispenser;
                }
            }
        }
        return headOfChain;
    }
}
