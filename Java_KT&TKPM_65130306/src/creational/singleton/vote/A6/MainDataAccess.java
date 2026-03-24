package creational.singleton.vote.A6;

public class MainDataAccess {
    public static void main(String[] args){
        dataAccess ui1 = dataAccess.getInstance();
        dataAccess ui2 = dataAccess.getInstance();

        ui1.add(new SanPham("01", 2, 50000, "Mut Dua"));
        ui2.add(new SanPham("02", 1, 70000, "Banh Chung"));

        dataAccess.getInstance().inDS();
    }
}
