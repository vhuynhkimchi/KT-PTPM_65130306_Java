package creational.singleton;

public class MainMySingleton {
    public static void main(String[] args){
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();
        s1.myPrintf();
        s2.myPrintf();
        s1.myPrintf();
        s2.myPrintf();
        s1.myPrintf();
    }
}
