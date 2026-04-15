package Structural.decorator.ongk2;

public class Sot extends DonHangDecorator{
    public Sot(AVKC donHang) {
        super(donHang);
    }

    @Override
    float TinhTong() {
        return super.TinhTong() + 2;
    }

    @Override
    void hienThi() {
        super.hienThi();
        System.out.println("Them Sot");
        System.out.println("Tong don hang: "+TinhTong());
    }
}
