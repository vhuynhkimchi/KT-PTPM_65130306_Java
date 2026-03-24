package behavioral.State.TV;

public class MainTV {
    public static void main(String[] args) {
        RemoteControl r = new RemoteControl();
        IRemoteState state = new OnState();
        r.setState(state);
        r.powerPress();
        r.powerPress();
    }
}
