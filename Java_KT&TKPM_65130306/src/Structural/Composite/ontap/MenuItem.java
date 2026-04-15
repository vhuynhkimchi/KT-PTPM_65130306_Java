package Structural.Composite.ontap;

public class MenuItem extends MenuComponent {
    int price;
    public MenuItem(String name, int price) {
        super(name);
        this.price = price;
    }

    @Override
    public int getPrice() { return price; }

    @Override
    public void display(String tab) {
        System.out.println(tab + "+ " + name + ": " + price + "đ");
    }
}
