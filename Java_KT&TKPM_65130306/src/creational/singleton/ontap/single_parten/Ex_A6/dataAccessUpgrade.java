package creational.singleton.ontap.single_parten.Ex_A6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dataAccessUpgrade {
    private static Map<String,dataAccessUpgrade> instance = new HashMap<>();
    List<String> sps = new ArrayList<>();

    private dataAccessUpgrade(){}
    public static dataAccessUpgrade getInstance(String tag){
        if (instance.get(tag) == null)
            instance.put(tag, new dataAccessUpgrade());
        return instance.get(tag);
    }

    public void add(SanPham s){
        sps.add(String.valueOf(s));
    }
    public void printDS(){
        for (var s : sps)
            System.out.println(sps.toString());
    }
}
