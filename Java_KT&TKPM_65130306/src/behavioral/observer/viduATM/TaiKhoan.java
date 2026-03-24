package behavioral.observer.viduATM;

public class TaiKhoan implements ATMListener{
    ATM atm;
    int soDu;
    String tentk;

    public TaiKhoan(String tentk, int soDu, ATM atm) {
        this.tentk = tentk;
        this.soDu = soDu;
        this.atm = atm;
    }

    public void duaThe(){
        atm.nhanThe(this);
    }

    public void rutThe(){
        atm.traThe();
    }

    @Override
    public boolean kiemTraSoDu(int soTien) {
        return (soDu - soTien) >= 50;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        if (kiemTraSoDu(soTienRut)){
            System.out.println("Rut thanh cong: " + soTienRut);
            soDu = soDu - soTienRut;
            System.out.println("Con lai " + soDu);
        }
        else
            System.out.println("Rut tien khong thanh cong.");
    }
}
