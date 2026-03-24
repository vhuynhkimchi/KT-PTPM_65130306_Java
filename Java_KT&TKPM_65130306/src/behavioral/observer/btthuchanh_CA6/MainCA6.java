package behavioral.observer.btthuchanh_CA6;

import behavioral.observer.baitapTH_CA1.DataAccess;

public class MainCA6 {
    public static void main(String[] args) {
        PlayerData player = new PlayerData();
        DashBoard board = new DashBoard(player);
        player.attach(board);

        player.setThoiGian(10);
        player.setCountDown(3);
        player.setGrade(100);

        player.ThongBao();
    }
}
