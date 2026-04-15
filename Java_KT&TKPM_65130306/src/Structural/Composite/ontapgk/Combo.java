package Structural.Composite.ontapgk;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Menu{
    List<Menu> dishs = new ArrayList<>();

    public Combo(String name) {
        super(name);
    }

    @Override
    public String hienThi() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.prefix).append("[").append(this.name).append(":").append(TinhTong()).append("d]");
        for (var dish : dishs){
            dish.prefix = this.prefix + " ";
            builder.append("\n").append(dish.hienThi());
            dish.prefix = "";
        }
        return builder.toString();
    }

    @Override
    public void add(Menu menu) {
        for (var dish: dishs){
            if (dish.name.equals(menu.name))
                return;
        }
        dishs.add(menu);
        menu.path = this.getPath() + "/" + menu.path;
    }

    @Override
    public float TinhTong() {
        int t = 0;
        for (var dish : dishs){
            t += dish.TinhTong();
        }
        return t;
    }
}
