package creational.singleton.ontap.single_parten.Ex_A6;

import creational.singleton.vote.A6.SanPham;

public class MaindataAccess_ex {
    public static void main(String[] args) {
        dataAccess ui1 = dataAccess.getInstance();
        dataAccess ui2 = dataAccess.getInstance();

        ui1.add(new SanPham("001", 2,25000,"Banh Phong Sua"));
        ui2.add(new SanPham("002", 5,35000,"Banh Dua Non"));

        dataAccess.getInstance().printDS();
    }
}
