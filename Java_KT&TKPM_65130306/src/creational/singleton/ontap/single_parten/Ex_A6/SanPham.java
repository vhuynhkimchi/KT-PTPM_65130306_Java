package creational.singleton.ontap.single_parten.Ex_A6;

public class SanPham {
    String id, tenSP;
    int sl;
    double donGia;

    public SanPham(String id, String tenSP, int sl, double donGia) {
        this.id = id;
        this.tenSP = tenSP;
        this.sl = sl;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id='" + id + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", sl=" + sl +
                ", donGia=" + donGia +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
