package Structural.decorator.ongk;

public class BorderDecorator extends Decorator{
    public BorderDecorator(String desciption, TrangTriAnh trangTriAnh) {
        super(desciption, trangTriAnh);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "," + this.desciption;
    }

    @Override
    public String HienThiAnh() {
        return super.HienThiAnh() + "Thêm Bolder ";
    }
}
