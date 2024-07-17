package LC_STRING;

import java.util.HashMap;
import java.util.HashSet;

public class LetsLC_STRING {
    public static void main(String[] args) {

        String s = "abcde";
        String t = "abced";
        System.out.println(isIsomorphic1(s,t));
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
    public static boolean isIsomorphic1(String s, String t) { //copied
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

    public static boolean isIsomorphic(String s , String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!map.containsKey(original)){   // s = egg  e,g,g- key
                if(!map.containsValue(replacement)){   // t = add   a,d,d - value
                    map.put(original, replacement);
                }
                else{
                    return false;
                }
            }
            else{
                char mapped = map.get(original);
                if(mapped != replacement){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean rotateString(String s, String goal) {
        return (s.length() == goal.length()) && (s+s).contains(goal);
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (int i = 0; i < t.length(); ++i) {
            char ch = t.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch) == 0){
                    map.remove(ch);
                }
            }
            else{
                return false;
            }
        }
        return true;
    }


}
