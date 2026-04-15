package creational.singleton.ontap.single_parten;

import creational.singleton.ontap.single_parten.Candidate;
import creational.singleton.ontap.single_parten.User;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("01");
        User u2 = new User("02");
        User u3 = new User("03");

        u1.vote(Candidate.JOE_BIDEN);
        u2.vote(Candidate.DONALD_TRUMP);
        u3.vote(Candidate.DONALD_TRUMP);

        Election.getInstance().Print();
    }
}
