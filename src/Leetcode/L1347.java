package Leetcode;

import java.util.HashMap;
import java.util.*;

public class L1347 {
    public static int minsteps(String s, String t){
        int [] countS = new int[26];
        int [] countT = new int[26];

        for(char ch :s.toCharArray()) {
                System.out.println(countS[ch-'a']++);

        }
        for(char ch: t.toCharArray()){
            System.out.println(countT[ch-'a']++);
        }
        return 8;


    }

    public static void main(String[] args) {


        int num = 50;
        System.out.println(largestnum(num));
    }

    public static int largestnum(int num){  //num = 50

        int max = 0;
        for (int i = 0; i <num; i++) {
            if(i%3==0){
                max = i;
                max = Math.max(max,i);
            }

        }
        return max;
    }


}
class L287{
    public int findDuplicate1(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
            int duplicate = map.get(i);
            if(duplicate==2){
                return i;
            }
        }
       return -1;

        
    }
    public int findduplicate(int [] nums){
        boolean[] taken = new boolean[nums.length];
        for(int num : nums){
            if(taken[num]){
                return num;
            }
            taken[num] =  true;
        }
        return 0;
    }

    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> ans = new Stack<>();
        ans.push(x);
        Stack<Integer> reverse = new Stack<>();
        for(int nums : st){
            reverse.push(nums);
        }
        for(int nums : reverse){
            ans.push(nums);
        }
        return ans;
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> maps = new HashMap<>();
        for(int i : nums) {
            maps.put(i, maps.getOrDefault(i, 0) + 1);

            int duplicate = maps.get(i);
            if (duplicate >= 2) {
                ans.add(i);
            }
        }
        return ans;
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] * nums[j] == k){
                    count++;
                }
            }
        }
        return count;
    }
}
