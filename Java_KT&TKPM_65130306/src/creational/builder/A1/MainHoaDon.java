package creational.builder.A1;

public class MainHoaDon {
    public static void main(String[] args){
        HoaDon hd = new HoaDon.Builder()
                .buildHeader("HD1", "29/1/2026", "KC")
                .addCTHD("Banh",2, 25000, 10)
                .addCTHD("Keo",3, 2000, 5)
                .build();
        hd.inHD();
    }
}
