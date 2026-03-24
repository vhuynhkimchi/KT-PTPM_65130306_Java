package behavioral.observer.viduATM;

public interface ATMListener {
    boolean kiemTraSoDu(int soTien);
    void nhanThongBao(int soTienRut, boolean thanhCong);
}
