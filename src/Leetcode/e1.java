package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class e1 {
    public static void main(String[] args) {

    }
    public int romanToInt(String s) {
        int num = 0; int ans =0;
        for (int i = s.length(); i >0; i++) {
            char ch = s.charAt(i);
            switch(s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if(4 * num < ans ) ans -= num;
            else ans +=num;
        }
        return ans;
    }
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> x = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            x.add(i);
            if(nums[i] == val){
                x.remove(i);
            }
        }

       return x.size();
    }
    public int lengthOfLastWord(String s) {
            int length = 0;
            char[] chars = s.toCharArray();
        for (int i = s.length()-1; i >0; i--) {
            if(chars[i] != ' '){
                length++;
            }
            if (i != 0 && chars[i-1] == ' ') {
                return length;
            }

        }
        return length;
    }
}
