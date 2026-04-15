package Structural.decorator.ongk;

public class FilterDecorator extends Decorator{
    public FilterDecorator(String desciption, TrangTriAnh trangTriAnh) {
        super(desciption, trangTriAnh);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "," + this.desciption;
    }

    @Override
    public String HienThiAnh() {
        return super.HienThiAnh() + "áp dụng bộ lộc màu";
    }
}
