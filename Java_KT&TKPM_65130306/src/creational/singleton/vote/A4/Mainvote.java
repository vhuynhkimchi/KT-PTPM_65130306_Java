package creational.singleton.vote.A4;

public class Mainvote {
    public static void main(String[] args){
        User u1 = new User("Kim Chi");
        User u2 = new User("Kim Nu");
        User u3 = new User("Kim");
        u1.vote(Candidate.DONALD_TRUMP);
        u2.vote(Candidate.JOE_BIDEN);
        u3.vote(Candidate.JOE_BIDEN);
        Election.getInstance().myPrint();
        u1.vote(Candidate.DONALD_TRUMP);
        Election.getInstance().myPrint();
    }
}
