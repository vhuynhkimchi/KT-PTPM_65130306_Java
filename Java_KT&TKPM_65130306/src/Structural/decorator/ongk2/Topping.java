package Structural.decorator.ongk2;

public class Topping extends DonHangDecorator{
    public Topping(AVKC donHang) {
        super(donHang);
    }

    @Override
    float TinhTong() {
        return super.TinhTong() + 5;
    }

    @Override
    void hienThi() {
        super.hienThi();
        System.out.println("Them Topping");
        System.out.println("Tong don hang: "+TinhTong());
    }
}
