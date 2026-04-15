package Structural.decorator.ontapgk;

public class DonHangDecorator extends AVKC{
    AVKC donHang;

    public DonHangDecorator(AVKC donHang) {
        this.donHang = donHang;
    }

    @Override
    public float TinhTong() {
        return donHang.TinhTong();
    }

    @Override
    public void hienThi() {
        donHang.hienThi();
    }
}
