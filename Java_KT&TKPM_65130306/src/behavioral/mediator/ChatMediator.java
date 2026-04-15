package behavioral.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ChatMediator implements IChatMediator{

    public HashMap<String, ChatUser> userMaps = new HashMap<>();

    @Override
    public void register(ChatUser user) {
        userMaps.put(user.id, user);
    }

    @Override
    public void unregister(ChatUser user) {
        userMaps.remove(user.id);
    }

    @Override
    public void sendMessage(String message, ChatUser from, String toId) {
        ChatUser toUser = userMaps.get(toId);
        if (toUser != null)
            toUser.receive(message,from);
        else
            System.out.println("Khong tim thay nguoi nhan.");
    }

    @Override
    public void sendBroadcast(String message, ChatUser from) {
        for (ChatUser user : userMaps.values())
            if (user != from){
                user.receive(message, from);
            }
    }
}
