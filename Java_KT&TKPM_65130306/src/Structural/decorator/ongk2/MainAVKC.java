package Structural.decorator.ongk2;

import java.util.ArrayList;
import java.util.List;

public class MainAVKC {
    public static void main(String[] args) {
        List<SanPham> sp1 = new ArrayList<>();
        sp1.add(new SanPham("Banh", 25,"Sieu Ngon"));
        sp1.add(new SanPham("Banh trang", 30,"Sieu Gion"));
        AVKC d1 = new DonHang(sp1);
        d1 = new DongGoi(d1);
        d1 = new Topping(d1);
        d1 = new GiamGia(d1);
        d1.hienThi();
    }
}
