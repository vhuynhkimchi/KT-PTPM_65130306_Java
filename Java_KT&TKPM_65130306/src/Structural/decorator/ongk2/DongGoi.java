package Structural.decorator.ongk2;

public class DongGoi extends DonHangDecorator{
    public DongGoi(AVKC donHang) {
        super(donHang);
    }

    @Override
    float TinhTong() {
        return super.TinhTong() + 4;
    }

    @Override
    void hienThi() {
        super.hienThi() ;
        System.out.println("Dong Goi Đặc Biệt, Hàng đảm bảo chất lượng không hư hại khi nhận hàng");
        System.out.println("Tong don hang: "+TinhTong());
    }
}
