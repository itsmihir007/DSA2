import java.util.*;

public class Main {
    public static void main(String[] args) {

        String s = "add";
        String t = "egg";
        System.out.println(isIsomorphic(s,t));
    }

    public static String removeConsecutiveCharacter(String S){
        HashSet<Character> set = new HashSet<>();
        for(char ch : S.toCharArray()){
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder(set.toString());
        return sb.toString();

    }
    //Leetcode
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            System.out.println(map.get(c));
            if(map.containsKey(c)){
                if(map.get(c)!=t.charAt(i)){

                    return false;
                }
            }else{System.out.println(map.containsValue(t.charAt(i)));
                if(map.containsValue(t.charAt(i))){

                    return false;
                }
                map.put(c,t.charAt(i));
            }
        }
        return true;
    }
}