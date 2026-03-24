package creational.builder.A1;

public class HoaDonHeader {
    String id, ngayBan, tenKh;

    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "id='" + id + '\'' +
                ", ngayBan='" + ngayBan + '\'' +
                ", tenKh='" + tenKh + '\'' +
                '}';
    }

    public HoaDonHeader(String id, String ngayBan, String tenKh) {
        this.id = id;
        this.ngayBan = ngayBan;
        this.tenKh = tenKh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }
}
