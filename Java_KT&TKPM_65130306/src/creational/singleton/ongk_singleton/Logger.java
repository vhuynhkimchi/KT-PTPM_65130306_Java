package creational.singleton.ongk_singleton;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    List<LogItem> ds = new ArrayList<>();
    private static Logger instance;

    private Logger(){}
    public static Logger getInstance(){
        if(instance == null)
            instance = new Logger();
        return instance;
    }
    public void writelog(LogItem log) {
        ds.add(log);
    }
    public void viewlog(){
        for(var l : ds)
            System.out.println(l.toString());
    }
}
