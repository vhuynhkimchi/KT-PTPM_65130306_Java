package behavioral.chain_of_responsibility.xeploaiHS;

public class MainXepLoaiHS {
    public static void main(String[] args) {
        XepLoai yeu = new Loai("Yếu", 5.0f);       // [0..5)
        XepLoai trungBinh = new Loai("Trung bình", 7.0f); // [5..7)
        XepLoai kha = new Loai("Khá", 8.0f);          // [7..8)
        XepLoai gioi = new Loai("Giỏi", 9.0f);         // [8..9)
        XepLoai xuatSac = new XuatSac("Xuất sắc", 10.0f);  // [9..10]

        yeu.gioiHon(trungBinh).gioiHon(kha).gioiHon(gioi).gioiHon(xuatSac);

        System.out.println("--- KẾT QUẢ XẾP LOẠI ---");
        yeu.XepLoai(4.5f);
        yeu.XepLoai(6.5f);
        yeu.XepLoai(7.0f);
        yeu.XepLoai(8.9f);
        yeu.XepLoai(9.5f);
        yeu.XepLoai(11.5f);
    }
}
