package creational.singleton.ongk_singleton;

public class Main {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Program p1 = new Program("p1");
        Program p2 = new Program("p2");
        p1.writeLog("ABC","13/4/2026");
        p2.writeLog("DEF","12/4/2026");

        log1.viewlog();

    }
}
