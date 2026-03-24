package behavioral.State.TV;

public class OnState implements IRemoteState {

    @Override
    public void handle(RemoteControl remote) {
        System.out.println("Bat TV");
        remote.setState(new OffState());
    }
}
