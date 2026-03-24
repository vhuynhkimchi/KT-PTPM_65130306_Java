package behavioral.chain_of_responsibility.xeploaiHS;

import behavioral.chain_of_responsibility.f88.NhanVienF88;

public class Loai extends XepLoai{
    XepLoai gioiHon;

    public Loai(String ten, float max) {
        super(ten, max);
    }

    @Override
    public void XepLoai(float diem) {
        if (diem < this.max)
            System.out.println("Điểm " + diem + " đạt xếp loại: " + this.ten);
        else
            this.gioiHon.XepLoai(diem);
    }

    @Override
    public XepLoai gioiHon(XepLoai gioiHon) {
        this.gioiHon = gioiHon;
        return this.gioiHon;
    }
}
