package Structural.Composite.file;

public class MainFile {
    public static void main(String[] args){
        Abstractfile d = new Folder("D:");
        Abstractfile taiLieu = new Folder("TaiLieu");
        Abstractfile laptrinh = new Folder("LapTrinh");
        Abstractfile c = new File("c.pptx");
        Abstractfile java = new File("java.pptx");
        Abstractfile design = new Folder("Design");
        Abstractfile creat = new File("Creational.pptx");
        Abstractfile structural = new File("Structural.pptx");
        Abstractfile ny = new File("ny.jpg");
        d.add(taiLieu);
        d.add(design);
        d.add(ny);
        taiLieu.add(laptrinh);
        laptrinh.add(c);
        laptrinh.add(java);
        design.add(creat);
        design.add(structural);
        System.out.println(d.getStringTreeFolder());
        System.out.println(java.getPath());

    }
}
