package Structural.decorator.ongk2;

public class GiamGia extends DonHangDecorator{
    public GiamGia(AVKC donHang) {
        super(donHang);
    }

    @Override
    float TinhTong() {
        return super.TinhTong() - 3;
    }

    @Override
    void hienThi() {
        super.hienThi();
        System.out.println("Giam Gia");
        System.out.println("Tong don hang: "+TinhTong());
    }
}
