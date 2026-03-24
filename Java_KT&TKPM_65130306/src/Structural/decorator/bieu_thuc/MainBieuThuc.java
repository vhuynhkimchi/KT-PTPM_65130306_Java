package Structural.decorator.bieu_thuc;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThuc b = new BieuThucDonGian(5);
        b = new Tru(b, 3);
        b = new Cong(b, 10);
        b = new Nhan(b, 5);
        System.out.println(b.toString());
    }
}
