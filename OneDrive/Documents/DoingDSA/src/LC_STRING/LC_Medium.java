package LC_STRING;

import java.util.HashMap;
import java.util.Map;

public class LC_Medium {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i =0 ; i <s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb = new StringBuilder();


        while(!map.isEmpty()){
            int max = 0;
            char maxchar = 'a';
            for(Map.Entry<Character,Integer> set : map.entrySet()){
                if(set.getValue() > max){
                    maxchar = set.getKey();
                    max = set.getValue();
                }

            }
            for (int i = 0; i < max; i++) {
                sb.append(maxchar);
            }
            map.remove(maxchar);
        }
        return sb.toString();

    }
    public int maxDepth(String s) {
        int max = 0;

        int openbracket = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                openbracket++;
            } else if (ch == ')') {
                openbracket--;
            }
            max= Math.max(openbracket,max);
        }
        return max;
    }


    public int romantoint(String s){
       HashMap<Character, Integer> map = new HashMap<>();
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);
       int result = map.get(s.charAt(s.length()-1));
        for (int i = s.length()-2; i >=0; i--) {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1)) ){
                result -= map.get(s.charAt(i));
            }
            else{
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
    public String inttoroman(int num) {
        String  [] romans = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int [] values = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        StringBuilder sb = new StringBuilder();
        for (int i = values.length; i>0 && num>0; i++) {
               while(num >= values[i]){
                   num -= values[i];
                   sb.append(romans[i]);
               }
        }
        return sb.toString();
    }
}
