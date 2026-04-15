package Structural.decorator.ongk;

public class Decorator extends TrangTriAnh{
    TrangTriAnh trangTriAnh;

    public Decorator(String desciption, TrangTriAnh trangTriAnh) {
        super(desciption);
        this.trangTriAnh = trangTriAnh;
    }

    @Override
    public String getDescription() {
        return trangTriAnh.getDescription();
    }

    @Override
    public String HienThiAnh() {
        return trangTriAnh.HienThiAnh();
    }
}
