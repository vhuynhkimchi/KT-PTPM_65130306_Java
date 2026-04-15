package creational.builder.ongk;

public class MainB3 {
    public static void main(String[] args) {
        Notification noti = new Notification.Builder().
                buildTitle("Thong Bao!").buildMessage("Ban co mot thong bao moi.")
                .build();
        Notification noti2 = new Notification.Builder().
                buildTitle("Thong Bao Het Han Data.").buildIcon("Mat buon.").
                buildSound("ting ting ting").build();

        System.out.println(noti.toString());
        System.out.println(noti2.toString());
    }
}
