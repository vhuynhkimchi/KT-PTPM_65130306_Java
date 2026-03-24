package behavioral.observer.ATM;

public interface ATMListener {
    boolean kiemTraSoDu(int soTien);
    void nhanThongBao(int soTienRut, boolean thanhCong);
}

