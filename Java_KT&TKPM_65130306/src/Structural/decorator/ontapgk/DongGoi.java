package Structural.decorator.ontapgk;

public class DongGoi extends DonHangDecorator{
    public DongGoi(AVKC donHang) {
        super(donHang);
    }

    @Override
    public float TinhTong() {
        return super.TinhTong() + 5;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Toi da them dong goi dac biet chong vo hang");
        System.out.println("Tong tien la: " + TinhTong());
    }
}
