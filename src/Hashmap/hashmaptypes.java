package Hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class hashmaptypes {
    public static void main(String[] args) {
        //worst time complexity O(n)
        LinkedHashMap<String, Integer> link = new LinkedHashMap<>();
        link.put("Mihir" , 01);
        link.put("Erica" , 02);
        link.put("huck", 03);

        System.out.println(link);
        //worst time complexity = O(logn)
        TreeMap<String , Integer> tree = new TreeMap<>();
        tree.put("Mihir" , 01);
        tree.put("Erica" , 02);
        tree.put("huck", 03);

        System.out.println(tree);
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("Mihir" , 01);
        hm.put("Erica" , 02);
        hm.put("huck", 03);

        System.out.println(hm);
    }

}
