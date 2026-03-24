package creational.singleton.vote.A4;

import creational.singleton.MySingleton;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;

    int trump = 0, biden = 0;
    List<String> voteUsers = new ArrayList<>();

    private Election(){
    }
    public static Election getInstance() {
        if (instance == null)
            instance = new Election();
        return instance;
    }

    protected void vote(Candidate c, String userId){
        for(var id: voteUsers)
            if (id.equals(userId))
                return;
        voteUsers.add(userId);
        if(c == Candidate.DONALD_TRUMP)
            trump++;
        else
            biden++;
    }
    public void myPrint(){
        System.out.println("Donald Trump: " + trump);
        System.out.println("Joe Biden: " + biden);
    }
}
