package Hashmap;

import java.util.HashMap;

public class fromtotravel {
    public static void main(String[] args) {
        HashMap<String , String> tickets = new HashMap<>();
        tickets.put("A" , "B");
        tickets.put("C", "D");
        tickets.put("E" , "A");
        tickets.put("D" , "E");
        String start = getstart(tickets);
        System.out.print(start);
        for(String key : tickets.keySet()){
            System.out.print("->" + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
    public static String getstart(HashMap<String, String> tickets){
        HashMap<String ,String > revMap = new HashMap<>();
        for(String key : tickets.keySet()){
            revMap.put(tickets.get(key) ,key);
        }
        for(String key : tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;

    }
}
