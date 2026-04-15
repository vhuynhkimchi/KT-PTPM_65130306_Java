package Structural.decorator.ongk;

public abstract class TrangTriAnh {
    String desciption;//biến lưu tên kiểu ảnh

    public TrangTriAnh(String desciption) {
        this.desciption = desciption;
    }
    //biến hiển thị ảnh để các hàm con tự định nghĩa
    public abstract String HienThiAnh();

    //Hàm trả về ảnh
    public String getDescription(){
        return desciption;
    }
}
