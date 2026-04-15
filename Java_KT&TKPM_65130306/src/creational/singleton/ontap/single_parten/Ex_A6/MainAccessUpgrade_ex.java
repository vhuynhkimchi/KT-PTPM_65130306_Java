package creational.singleton.ontap.single_parten.Ex_A6;

public class MainAccessUpgrade_ex {
    public static void main(String[] args) {
        dataAccessUpgrade ui1 = dataAccessUpgrade.getInstance("Kim");
        dataAccessUpgrade ui2 = dataAccessUpgrade.getInstance("Chi");
        dataAccessUpgrade ui3 = dataAccessUpgrade.getInstance("Chi");

        ui1.add(new SanPham("001","Banh dua non", 2, 25000));
        ui2.add(new SanPham("002","Banh phong sua", 3, 35000));

        ui1.printDS();
        ui2.printDS();
        ui3.printDS();
    }
}
