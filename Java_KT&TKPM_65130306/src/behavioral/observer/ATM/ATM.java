package behavioral.observer.ATM;

import behavioral.observer.tigia.TiGia;

import java.util.ArrayList;
import java.util.List;

public class ATM {
    ATMListener taikhoan; //Biến lưu trữ người đang cắm thẻ vào máy ATM (Observer)

    //Hàm Attach, nhận người đăng ký
    public  void nhanThe(ATMListener tk){
        taikhoan = tk;
    }

    //Hàm Detach, hủy người đăng ký
    void traThe(){
        taikhoan=null;
    }


    void rutTien(int soTien){
        if (taikhoan == null){
            System.out.println("Mời đưa thẻ vào ATM.");
            return;
        }
        else {
            //Máy ATM gọi hàm Observer có đủ tiền hay không
            if (taikhoan.kiemTraSoDu(soTien)){
                //nếu đủ thì máy nhả tiền và cập nhật lại số dư
                taikhoan.nhanThongBao(soTien, true);
            }
            else
                //nếu không đủ thì cũng sẽ Notify lại để thông báo "thất bại"
                taikhoan.nhanThongBao(soTien,false);
        }

    }

}
