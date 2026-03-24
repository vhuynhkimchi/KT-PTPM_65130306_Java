package behavioral.observer.btthuchanh_CA2;

public class Button {
    ButtonListener activity;

    public void attach(ButtonListener listener) {
        this.activity = listener;
    }
    public void click(){
        activity.onClick();
    }
}
