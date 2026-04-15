package creational.singleton.ontap.single_parten;

import java.util.ArrayList;
import java.util.List;

public class Election {
    int trump = 0, biden = 0;
    private static Election instance;
    List<String> voteUser = new ArrayList<>();

    private Election(){}
    public static Election getInstance(){
        if(instance == null)
            instance = new Election();
        return instance;
    }

    protected void vote(Candidate c, String userId){
        for (var id : voteUser)
            if (id.equals(userId))
                return;
        voteUser.add(userId);
        if (c == Candidate.DONALD_TRUMP)
            trump++;
        else
            biden++;
    }
    public void Print(){
        System.out.println("Trump: " +trump);
        System.out.println("Biden: " +biden);
    }
}
