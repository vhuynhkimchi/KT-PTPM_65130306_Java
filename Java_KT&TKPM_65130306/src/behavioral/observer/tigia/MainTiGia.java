package behavioral.observer.tigia;

public class MainTiGia {
    public static void main(String[] args) {
        TiGia t = new TiGia();
        NhaDauTu a = new NhaDauTuA("KC", t);
        NhaDauTu b = new NhaDauTuB("KN", t);

        System.out.println("Lan 1 ");
        t.notify(5);
        b.huyDangKy();

        System.out.println("Lan 2");
        t.notify(-5);
        b.dangKy();

        System.out.println("Lan 3");
        t.notify(-5);
    }
}
