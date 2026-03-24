package behavioral.observer.viduATM;

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan tk = new TaiKhoan("KimChi", 50_000_000, atm);

        atm.rutTien(5_000_000);
        tk.duaThe();
        atm.rutTien(10_000_000);
        atm.rutTien(50_000_000);
        atm.rutTien(39_950_000);
    }
}
