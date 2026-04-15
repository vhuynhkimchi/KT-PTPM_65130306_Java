package Structural.Composite.ontapgk;

public abstract class Menu {
    String name, path;
    String prefix = " ";

    public Menu(String name) {
        this.name = name;
        this.path = name;
    }

    public abstract String hienThi();

    public String getPath(){return path;}
    public abstract void add(Menu menu);
    public abstract float TinhTong();
}
