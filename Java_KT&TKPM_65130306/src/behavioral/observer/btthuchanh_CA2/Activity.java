package behavioral.observer.btthuchanh_CA2;

public class Activity implements ButtonListener{
    Button button;
    int cnt = 0;

    public Activity(Button button) {
        this.button = button;
    }

    @Override
    public void onClick() {
        cnt++;
        System.out.println("bạn click lần thứ " + cnt);
    }
}
