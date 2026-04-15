package Structural.Composite.ontapgk;

import creational.factory.pizza.Pizza;

public class Mainmenu {
    public static void main(String[] args) {
        Menu dish1 = new Dish("Pizza", 250);
        Menu dish2 = new Dish("Sandwich", 50);
        Menu dish3 = new Dish("Coca", 20);
        Menu combo1 = new Combo("Mon Gia Dinh");
        combo1.add(new Dish("Com trang", 50));
        combo1.add(new Dish("Thit kho", 100));
        combo1.add(new Dish("Rau Muong", 70));
        Menu combo2 = new Combo("An nhanh");
        combo2.add(new Dish("Ga Ran",35));
        combo2.add(dish3);
        combo2.add(combo1);

        Combo menu = new Combo("Menu Nha Hang");
        menu.add(dish1);
        menu.add(dish2);
        menu.add(dish3);
        menu.add(combo1);
        menu.add(combo2);

        System.out.println(menu.hienThi());
    }
}
