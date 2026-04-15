package Structural.decorator.ontapgk;

public class Topping extends DonHangDecorator{
    public Topping(AVKC donHang) {
        super(donHang);
    }

    @Override
    public float TinhTong() {
        return super.TinhTong()+ 4;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Them Topping nhe");
        System.out.println("Tong tien la: " + TinhTong());
    }
}
