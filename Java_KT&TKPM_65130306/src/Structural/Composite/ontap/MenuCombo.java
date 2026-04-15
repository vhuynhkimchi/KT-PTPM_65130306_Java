package Structural.Composite.ontap;

import java.util.ArrayList;
import java.util.List;

public class MenuCombo extends MenuComponent {
    List<MenuComponent> items = new ArrayList<>();

    public MenuCombo(String name) { super(name); }

    @Override
    public void add(MenuComponent c) { items.add(c); }

    @Override
    public int getPrice() {
        int total = 0;
        for (MenuComponent item : items) {
            total += item.getPrice(); // Đệ quy tính giá từng món con
        }
        return total;
    }

    @Override
    public void display(String tab) {
        System.out.println(tab + "== COMBO: " + name.toUpperCase() + " ==");
        for (MenuComponent item : items) {
            item.display(tab + "   "); // Đệ quy hiển thị từng món con
        }
        System.out.println(tab + "--> TỔNG GIÁ COMBO [" + name + "]: " + getPrice() + "đ");
    }
}
