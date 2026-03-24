package behavioral.State.TV;

public class RemoteControl {
    IRemoteState state;
    public RemoteControl(){
        state = new OffState();
    }
    void setState(IRemoteState state){
        this.state = state;
    }
    void powerPress(){
        state.handle(this);
    }

}
