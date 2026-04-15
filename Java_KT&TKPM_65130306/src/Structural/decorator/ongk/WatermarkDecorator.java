package Structural.decorator.ongk;

public class WatermarkDecorator extends Decorator{
    public WatermarkDecorator(String desciption, TrangTriAnh trangTriAnh) {
        super(desciption, trangTriAnh);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ "," + this.desciption;
    }

    @Override
    public String HienThiAnh() {
        return super.HienThiAnh() + "Chèn watermark ";
    }
}
