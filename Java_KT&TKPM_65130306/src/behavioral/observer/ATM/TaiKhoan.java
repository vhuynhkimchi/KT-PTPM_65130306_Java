package behavioral.observer.ATM;

public class TaiKhoan implements ATMListener{

    ATM atm; //tham chiếu đến máy ATM để biết đang cấm vào máy nào
    String tenTK;
    int soDu;

    //Hàm khởi tạo constructor
    public TaiKhoan(String tenTK, int soDu, ATM atm) {
        this.atm = atm;
        this.tenTK = tenTK;
        this.soDu = soDu;
    }

    void duaThe(){
        atm.nhanThe(this);
    }

    void rutThe(){
        //báo cho máy ATM xóa mình đi
        atm.traThe();
    }
    @Override
    public boolean kiemTraSoDu(int soTien) {
        //Kiểm tra số dư giả sử ngân hàng quy định số dư >= 50k
        return (soDu - soTien) >= 50;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {

        if (thanhCong){
            System.out.println("Rut thanh cong " + soTienRut);
            soDu = soDu - soTienRut;
            System.out.println("So tien con lai: " + soDu);
        }
        else
            System.out.println("Rut tien khong thanh cong.");
            System.out.println("So tien con lai: " + soDu);
    }
}
