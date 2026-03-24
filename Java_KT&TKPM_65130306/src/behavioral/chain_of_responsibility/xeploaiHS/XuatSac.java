package behavioral.chain_of_responsibility.xeploaiHS;

public class XuatSac extends XepLoai{
    public XuatSac(String ten, float max) {
        super(ten, max);
    }

    @Override
    public void XepLoai(float diem) {
        if (diem < this.max)
            System.out.println("Điểm " + diem + " đạt xếp loại: " + this.ten);
        else
            System.out.println("Điểm " + diem + " không hợp lệ > 10");
    }

    @Override
    public XepLoai gioiHon(XepLoai gioiHon) {
        return null;
    }

}
