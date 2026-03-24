package behavioral.observer.viduATM;

public class ATM {
    ATMListener taikhoan;

    public void nhanThe(ATMListener tk){
        this.taikhoan = tk;
    }
    public void traThe(){
        taikhoan = null;
    }

    public void rutTien(int soTien){
        if (taikhoan == null) {
            System.out.println("Moi dua the vao.");
            return;
        }
        else
            if (taikhoan.kiemTraSoDu(soTien)){
                taikhoan.nhanThongBao(soTien, true);
            }
            else
                taikhoan.nhanThongBao(soTien, false);
    }
}
