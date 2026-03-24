package creational.factory.pizza.vietnam;

import creational.factory.pizza.Pizza;

public class HaiSanPizza extends Pizza {

    @Override
    public void prepare() {
        this.getBuilder().append("Bot mi, tom, muc");
    }

    @Override
    public void bake() {
        this.getBuilder().append("\nNuong tren lo than 20p");
    }

    @Override
    public void cut() {
        this.getBuilder().append("\nCat lam 8 mieng");
    }

    @Override
    public void box() {
        this.getBuilder().append("\nDong hop");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public StringBuilder getBuilder() {
        return super.getBuilder();
    }
}
