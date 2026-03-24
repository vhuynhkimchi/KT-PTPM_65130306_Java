package Structural.Composite.file;

public abstract class Abstractfile {
    String name, path;
    String prefix = "   ";

    public Abstractfile(String name) {
        this.name = name;
        this.path = name;
    }
    abstract public String getStringTreeFolder();
    public String getPath(){
        return path;
    }
    public abstract void add(Abstractfile f);
}
