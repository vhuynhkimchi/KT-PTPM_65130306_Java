package behavioral.State.TV;

public class OffState implements IRemoteState {
    @Override
    public void handle(RemoteControl remote) {
        System.out.println("Tat TV");
        remote.setState(new OnState());

    }
}
