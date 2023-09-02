package Hashmap;
import java.util.*;

import java.util.HashMap;

public class hm {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India" , 01);
        hm.put("USA" , 02);
        hm.put("Canada" , 03);


        Set<String> key = hm.keySet();
        int v =0;
               if(hm.containsKey(23)){
                   v = hm.get("23");
               }
//        System.out.println(v);
//        System.out.println(key);
        for(String k : key){
            System.out.println(k) ;


        }
        int vm = 2;
        if(hm.containsKey(vm)){
            hm.remove(vm);
        }
        System.out.println("updated hashmap" + hm);
        int vi = hm.size();
        System.out.println("size is " + vi);

       // hm.remove(03);
//        System.out.println(hm);
//        System.out.println(hm.remove(3));
//        int rank = hm.get("India");
//        System.out.println(hm.size());
//        System.out.println(hm.isEmpty());
//        hm.clear();
//        System.out.println(hm);
//
//
//        System.out.println( hm.get("Indi"));
//        System.out.println(rank);
    }
}
