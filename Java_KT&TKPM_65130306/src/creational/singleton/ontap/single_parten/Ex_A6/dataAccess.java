package creational.singleton.ontap.single_parten.Ex_A6;

import creational.singleton.vote.A6.SanPham;

import java.util.ArrayList;
import java.util.List;

public class dataAccess {
    private static dataAccess instance;
    List<SanPham> sps = new ArrayList<SanPham>();

    private dataAccess(){}
    public static dataAccess getInstance(){
        if(instance == null)
            instance = new dataAccess();
        return instance;
    }
    public void add(SanPham s){
        sps.add(s);
    }
    public void printDS(){
        for (var s: sps)
            System.out.println(s.toString());
    }
}
