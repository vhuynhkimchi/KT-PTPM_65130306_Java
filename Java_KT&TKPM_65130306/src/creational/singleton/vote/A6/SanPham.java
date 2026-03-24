package creational.singleton.vote.A6;

public class SanPham {
    String maSP, ten;
    int donGia, soLuong;


    @Override
    public String toString() {
        return "SanPham{" +
                "maSP='" + maSP + '\'' +
                ", ten='" + ten + '\'' +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                '}';
    }

    public SanPham(String maSP, int soLuong, int donGia, String ten) {
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.ten = ten;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
