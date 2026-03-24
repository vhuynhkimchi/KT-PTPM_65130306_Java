package creational.singleton.vote.A6;

import java.util.ArrayList;
import java.util.List;

public class dataAccess {
    private static dataAccess instance;
    List<SanPham> sps = new ArrayList<>();


    public  static dataAccess getInstance(){
        if(instance == null)
            instance = new dataAccess();
        return instance;
    }
    private dataAccess(){
    }

    public void add(SanPham s){
        sps.add(s);
    }
    public void inDS(){
        for(var sp: sps)
            System.out.println(sp.toString());
    }

}
