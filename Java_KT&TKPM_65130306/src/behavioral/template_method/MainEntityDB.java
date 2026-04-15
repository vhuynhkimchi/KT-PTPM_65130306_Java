package behavioral.template_method;

public class MainEntityDB {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(65130,"Kim Chi","16/8/2005", "Phu Yen");
        SinhVien sv2 = new SinhVien(65130,"B","14/7/2005", "Nha Trang");
        SinhVien sv3 = new SinhVien(65130,"B","1/2/2005", "Nha Trang");
        SinhVien sv4 = new SinhVien(65130,"B","28/7/2005", "Nha Trang");
        MonHoc mh1 = new MonHoc(1,"LTTBDD",3);
        MonHoc mh2 = new MonHoc(2,"Thiet Ke Web",3);
        MonHoc mh3 = new MonHoc(3,"Mobile",4);

        System.out.println(sv1.toString());
        System.out.println(mh1.toString());



    }
}
