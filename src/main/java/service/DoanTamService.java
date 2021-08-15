package service;

import model.DoanTam;

import java.util.ArrayList;

public class DoanTamService {
    public ArrayList<DoanTam> list=new ArrayList<>();
    public DoanTamService(){
        list.add(new DoanTam("doantam","112","davang","00"));
        list.add(new DoanTam("doantoan","12","davang","00"));
        list.add(new DoanTam("doantu","11","davang","00"));
        list.add(new DoanTam("doanhung","2","davang","00"));
    }
    public void save(DoanTam doanTam){
        list.add(doanTam);
    }
    public void edit(DoanTam doanTam ,int index){
        list.set(index,doanTam);
    }
    public void delete(int index){
        list.remove(index);
    }
}
