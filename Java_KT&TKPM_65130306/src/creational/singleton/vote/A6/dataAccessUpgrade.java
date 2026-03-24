package creational.singleton.vote.A6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dataAccessUpgrade {
    private static Map<String, dataAccessUpgrade> instance = new HashMap<>();
    List<SanPham> sps = new ArrayList<>();


    public  static dataAccessUpgrade getInstance(String tag){
        if(instance.get(tag) == null)
            instance.put(tag, new dataAccessUpgrade());
        return instance.get(tag);
    }
    private dataAccessUpgrade(){
    }

    public void add(SanPham s){
        sps.add(s);
    }
    public void inDS(){
        for(var sp: sps)
            System.out.println(sp.toString());
    }
}
