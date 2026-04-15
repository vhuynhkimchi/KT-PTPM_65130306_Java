package Structural.decorator.ongk2;

public class SanPham {
    String tenSP;
    public int giaTien;
    String moTa;

    public SanPham(String tenSP, int giaTien, String moTa) {
        this.tenSP = tenSP;
        this.giaTien = giaTien;
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "tenSP='" + tenSP + '\'' +
                ", giaTien=" + giaTien +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}
