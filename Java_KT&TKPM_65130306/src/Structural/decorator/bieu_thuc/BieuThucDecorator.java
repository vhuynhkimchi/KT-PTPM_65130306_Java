package Structural.decorator.bieu_thuc;

public class BieuThucDecorator extends BieuThuc{
    BieuThuc bieuthuc;
    public BieuThucDecorator(BieuThuc bieuThuc) {

        this.bieuthuc= bieuThuc;
    }

    @Override
    public float giaTri() {
        return bieuthuc.giaTri();
    }

    @Override
    public String bieuThuc() {

        return bieuthuc.bieuThuc();
    }
}
