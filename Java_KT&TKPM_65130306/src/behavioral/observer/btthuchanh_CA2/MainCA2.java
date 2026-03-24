package behavioral.observer.btthuchanh_CA2;

public class MainCA2 {
    public static void main(String[] args) {
        Button b = new Button();
        Activity a = new Activity(b);
        b.attach(a);
        b.click();
        b.click();
    }
}
