package behavioral.chain_of_responsibility.xeploaiHS;

import behavioral.chain_of_responsibility.f88.NhanVienF88;

public abstract class XepLoai {
    String ten;
    float max;

    public XepLoai(String ten, float max) {
        this.ten = ten;
        this.max = max;
    }
    public abstract void XepLoai(float diem);
    public  abstract XepLoai gioiHon(XepLoai gioiHon);

}
