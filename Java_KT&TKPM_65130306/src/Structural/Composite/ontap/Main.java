package Structural.Composite.ontap;

public class Main {
    public static void main(String[] args) {
        // 1. Tạo các món lẻ
        MenuComponent pizza = new MenuItem("Pizza Hải Sản", 150000);
        MenuComponent coke = new MenuItem("Coca Cola", 20000);
        MenuComponent fries = new MenuItem("Khoai tây chiên", 35000);

        // 2. Tạo Combo
        MenuCombo comboFamily = new MenuCombo("Gia đình vui vẻ");
        comboFamily.add(pizza);
        comboFamily.add(fries);
        comboFamily.add(coke);

        // 3. Hiển thị
        comboFamily.display("");
    }
}