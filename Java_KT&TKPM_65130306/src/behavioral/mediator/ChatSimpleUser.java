package behavioral.mediator;

public class ChatSimpleUser extends ChatUser{


    public ChatSimpleUser(IChatMediator mediator, String id, String name) {
        super(mediator, id, name);
    }

    @Override
    public void receive(String message, ChatUser from) {
        System.out.println( this.name + " nhan tu " + from.name + ":" + message );
    }
}
