package behavioral.observer.btthuchanh_CA6;

public class DashBoard implements PlayerDataListener{
    PlayerData playerData;

    public DashBoard(PlayerData playerData) {
        this.playerData = playerData;
    }

    @Override
    public void listen(PlayerData data) {
        System.out.println("Thời Gian " + data.thoiGian +
                "\n" + "Số lượt chơi còn lại : " + data.countDown +
                "\n" + "Điểm số đạt được của trò chơi: " + data.grade);
    }
}
