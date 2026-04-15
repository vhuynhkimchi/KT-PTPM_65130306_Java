package creational.singleton.ontap.single_parten;

public class User {
    private String id;

    public User(String id) {
        this.id = id;
    }

    void vote(Candidate c){
        Election.getInstance().vote(c, this.id);
    }
}
