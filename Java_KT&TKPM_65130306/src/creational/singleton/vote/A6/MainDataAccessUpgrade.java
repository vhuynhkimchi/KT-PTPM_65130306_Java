package creational.singleton.vote.A6;

public class MainDataAccessUpgrade {
    public static void main(String[] args) {
        dataAccessUpgrade ui1 = dataAccessUpgrade.getInstance("Danh");
        dataAccessUpgrade ui2 = dataAccessUpgrade.getInstance("Chi");
        dataAccessUpgrade ui3 = dataAccessUpgrade.getInstance("Chi");

        ui1.add(new SanPham("01", 2, 50000, "Mut Dua"));
        //ui1.add(new SanPham("02", 1, 70000, "Banh Chung"));
        ui2.add(new SanPham("03", 3, 80000, "Mut"));

        ui1.inDS();
        ui2.inDS();
        ui3.inDS();
    }
}
