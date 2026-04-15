package Structural.decorator.ongk2;

import java.util.ArrayList;
import java.util.List;

public class DonHang extends AVKC{
    List<SanPham> sps;

    public DonHang(List<SanPham> sps) {
        this.sps = sps;
    }

    @Override
    float TinhTong() {
        float t = 0;
        for (var sp : sps){
            t += sp.giaTien;
        }
        return t;
    }

    @Override
    public void hienThi() {
        for (var sp:sps)
            System.out.println(sp.toString());
        System.out.println(TinhTong());
    }

}
