package Structural.decorator.ongk;

public class Main {
    public static void main(String[] args) {
        TrangTriAnh anh1 = new XemAnh("Anh photobooth");
        System.out.println(anh1.getDescription());
        anh1 = new BorderDecorator("Viền đỏ", anh1);
        System.out.println("Mô tả: " + anh1.getDescription());
        System.out.println("Hiển Thị: " + anh1.HienThiAnh());
        anh1 = new WatermarkDecorator("image", anh1);
        System.out.println("Mô tả: " + anh1.getDescription());
        System.out.println("Hiển Thị: " + anh1.HienThiAnh());
        anh1 = new FilterDecorator("sticker", anh1);
        System.out.println("Mô tả: " + anh1.getDescription());
        System.out.println("Hiển Thị: " + anh1.HienThiAnh());
    }
}
