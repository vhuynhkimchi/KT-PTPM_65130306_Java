package behavioral.stratery.duck_65CNTT1;

abstract public class Duck65CNTT1 {
    //Khai báo tham chiếu kiểu Interface
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    //Phương thức trừu tượng
    public abstract void display();

    //Phương thức thường
    public void swim(){
        System.out.println("Vô địch Olympic bơi bướm");
    }

    public void performFly(){
        System.out.println(flyBehavior.fly());
    }

    public void performQuack(){
        System.out.println(quackBehavior.quack());
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {

        this.quackBehavior = quackBehavior;
    }
}
