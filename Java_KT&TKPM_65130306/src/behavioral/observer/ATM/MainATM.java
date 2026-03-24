package behavioral.observer.ATM;

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan tk1 = new TaiKhoan("Kim Chi",10_000_000, atm);
        atm.rutTien(5_000_000);
        tk1.duaThe();
        atm.rutTien(5_000_000);
        atm.rutTien(10_000_000);
        atm.rutTien(3_000_000);
        tk1.rutThe();
        atm.rutTien(100000);
    }
}
