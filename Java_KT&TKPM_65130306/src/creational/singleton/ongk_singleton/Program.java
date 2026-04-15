package creational.singleton.ongk_singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program  {
    private String id;

    public Program(String id) {
        this.id = id;
    }

    public void writeLog(String noiDung, String thoiGian){
        Logger l = Logger.getInstance();
        l.writelog(new LogItem(noiDung, thoiGian,id));
    }
}