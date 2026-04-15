package behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        IChatMediator mediator = new ChatMediator();

        ChatUser name1 = new ChatSimpleUser(mediator, "1", "Chi");
        ChatUser name2 = new ChatSimpleUser(mediator, "2", "Kim");

        name1.register();
        name2.register();

        name1.sendMessage("Hello","2");
        name2.sendMessage("Hi", "1");
    }
}
