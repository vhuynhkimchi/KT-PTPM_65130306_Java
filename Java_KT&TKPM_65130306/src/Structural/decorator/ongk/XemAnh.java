package Structural.decorator.ongk;

public class XemAnh extends TrangTriAnh{
    public XemAnh(String desciption) {
        super(desciption);
    }

    @Override
    public String HienThiAnh() {
        return "Hình Ảnh ";
    }
}
