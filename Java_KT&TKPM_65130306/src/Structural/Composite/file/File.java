package Structural.Composite.file;

public class File extends Abstractfile{
    public File (String name){
        super(name);
    }

    @Override
    public String getStringTreeFolder() {
        return this.prefix + this.name;
    }

    @Override
    public String getPath() {
        return super.getPath();
    }

    @Override
    public void add(Abstractfile f) {

    }

}
