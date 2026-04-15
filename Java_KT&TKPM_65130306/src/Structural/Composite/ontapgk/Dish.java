package Structural.Composite.ontapgk;

public class Dish extends Menu{

    int giaTien;

    public Dish(String name, int giaTien) {
        super(name);
        this.giaTien = giaTien;
    }

    @Override
    public String hienThi() {
        return this.prefix + this.name;
    }

    @Override
    public String getPath() {
        return super.getPath();
    }

    @Override
    public void add(Menu menu) {

    }

    @Override
    public float TinhTong() {
        return giaTien;
    }
}
