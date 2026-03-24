package behavioral.stratery.duck_65CNTT1;

public class MainDuck65CNTT1 {
    public static void main(String[] args) {
        Duck65CNTT1 d = new Vit();
        d.setFlyBehavior(new FlyWithWing());
        d.setQuackBehavior(new SQuack());
        d.display();
    }
}
