package creational.builder.A1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader header;
    List<CTHD> cthds;

    protected HoaDon(Builder builder) {
        this.header = builder.header;
        this.cthds = builder.cthds;
    }

    public void inHD(){
        System.out.println(header.toString());
        for (var cthd: cthds)
            System.out.println(cthd);
    }
    public static class Builder{
        HoaDonHeader header;
        List<CTHD> cthds = new ArrayList<>();

        public Builder buildHeader(String id, String ngayBan, String tenKh){
            header = new HoaDonHeader(id, ngayBan, tenKh);
            return this;
        }

        public Builder addCTHD(String sanPham, int soLuong, int donGia, float chietKhau){
            cthds.add (new CTHD(sanPham, soLuong, donGia, chietKhau));
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
