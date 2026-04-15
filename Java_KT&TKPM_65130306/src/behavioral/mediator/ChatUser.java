package behavioral.mediator;

public abstract class ChatUser{
    IChatMediator mediator;
    String id;
    String name;

    public ChatUser(IChatMediator mediator,String id, String name) {
        this.mediator = mediator;
        this.id = id;
        this.name = name;
    }

    public void register() {
        mediator.register(this);
    }

    public void unregister() {
        mediator.unregister(this);
    }

    public void sendMessage(String message, String toId) {
        mediator.sendMessage(message, this, toId);
    }

    public void sendBroadcast(String message) {
        mediator.sendBroadcast(message,this);
    }
    public abstract void receive(String message, ChatUser from);
}
