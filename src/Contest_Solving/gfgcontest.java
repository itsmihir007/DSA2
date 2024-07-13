package Contest_Solving;
import com.sun.jdi.ArrayReference;

import java.util.*;
import java.util.concurrent.CountDownLatch;

public class gfgcontest {
    public static int CountPairs(int n, int k, int nums[]) {
        // Code Here.
        int count = 0;
        int i = 0;

        while(i < n){
            for (int j = 0; j < n; j++) {
                if(nums[i] == nums[j] && i < j){
                    if((i + j+2)% k == 0){
                        count++;
                    }
                }

            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = {1 ,1, 1, 1, 1, 1};
        System.out.println( CountPairs(6,4,arr));
    }
    public String removeStars(String s) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '*'){
                    sb.deleteCharAt(sb.length()-1);
                }
                else{
                    sb.append(i);
                }
            }
            return sb.toString();
    }

    public void moveZeroes(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                count++;
                continue;
            }
            else{
                ans.add(nums[i]);
            }
        }
        while(count > 0){
            ans.add(0);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans.get(i);
        }
    }

    public double minimumAverage(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num : nums){
            arr.add(num);
        }
        double average = 0;
        while(n/2 != 0){
            average = (findlargest(arr) + findsmallest(arr)/2);
            arr.remove(findlargest(arr));
            arr.remove(findsmallest(arr));
            n--;
        }
        return average;
    }
    public int findlargest(ArrayList<Integer> nums){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max){
                max = nums.get(i);
            }
        }
        return max;
    }
    public int findsmallest(ArrayList<Integer> nums){
        int min= Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) < min){
                min = nums.get(i);
            }
        }
        return min;
    }

    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        if(s.isEmpty()){
            return true;
        }
        while(start <=  end){
            char currchar = s.charAt(start);
            char lastchar = s.charAt(end);
            if(!Character.isLetterOrDigit(currchar)){
                start++;
            } else if (!Character.isLetterOrDigit(end)) {
                end--;
            }
            else{
                if(Character.toLowerCase(currchar) != Character.toLowerCase(lastchar)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
    public void reverseString(char[] s) {

        reverse(s,0, s.length-1);
    }
    public void reverse(char[] s, int start , int end) {
        if(start >= end ) return;
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        reverse(s, start++, end--);
    }

    public int longestPalindrome(String s) {
        int res = 0;
        int val = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() %2 != 0){
                res += entry.getValue()-1;
                val = 1;
            }
            else{
                res +=entry.getValue();
            }
        }
        return res + val;
    }


}
