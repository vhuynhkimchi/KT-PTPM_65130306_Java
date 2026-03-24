package Structural.Composite.file;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Abstractfile{
    List<Abstractfile> files = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        //1. Tên của thư mục vao cay
        builder.append(this.prefix).append(this.name);
        for (var f: files){
            f.prefix = this.prefix + "  ";
            builder.append("\n").append(f.getStringTreeFolder());
            f.prefix = "";
        }
        return builder.toString();
    }
    @Override
    public void add(Abstractfile f) {
        //1.Them
        for (var file: files)
            if (file.name.equals(f.name))
                return;
        files.add(f);
        //2. Cap nhat duong dan cua f
        f.path = this.getPath() + "\\" + f.path;
    }

}
