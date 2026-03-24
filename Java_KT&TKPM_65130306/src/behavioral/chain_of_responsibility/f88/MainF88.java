package behavioral.chain_of_responsibility.f88;

public class MainF88 {
    public static void main(String[] args) {
        NhanVienF88 bv = new NhanVienChoVay("A", "Bao ve", 1_000_000);
        NhanVienF88 nv = new NhanVienChoVay("B", "Nhan Vien", 10_000_000);
        NhanVienF88 tk = new NhanVienChoVay("C", "Thu Ky", 50_000_000);
        NhanVienF88 tp = new NhanVienChoVay("D", "Truong phong", 100_000_000);
        NhanVienF88 giamdoc = new NhanVienChoVay("E", "Giam Doc", 500_000_000);
        NhanVienF88 chuTich = new ChuTich("F", "Chu Tich", 1_000_000_000);
        bv.capTren(nv).capTren(tk).capTren(tp).capTren(giamdoc).capTren(chuTich);
        bv.duyetVay(2_000_000);
        bv.duyetVay(700_000_000);
        bv.duyetVay(2_000_000_000);
    }
}
