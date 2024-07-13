package Contest_Solving;

import javax.management.InstanceNotFoundException;
import java.util.*;
class Leetcode{
    public static String reverseWords(String strToWordReverse) {
        char[] charsToWordReverse = strToWordReverse.toCharArray();
        int i = 0;
        int j = charsToWordReverse.length - 1;

        // Reverse the entire string
        while (i < j) {
            char temp = charsToWordReverse[i];
            charsToWordReverse[i] = charsToWordReverse[j];
            charsToWordReverse[j] = temp;
            i++;
            j--;
        }

        // Reverse individual words
        int start = 0;
        for (int end = 0; end < charsToWordReverse.length; end++) {
            if (charsToWordReverse[end] == ' ') {
                reverse(charsToWordReverse, start, end - 1);
                start = end + 1;
            }
        }
        // Reverse the last word
        reverse(charsToWordReverse, start, charsToWordReverse.length - 1);
        if(charsToWordReverse[0] == ' ' || charsToWordReverse[charsToWordReverse.length-1] == ' '){
            
        }
        // Convert the char array back to a String
        String reversedString = new String(charsToWordReverse);
        return reversedString;
    }
    public static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }



    public int longestPalindrome(String s) {
        int res = 0;
        int val = 0;
        //aabbcbbaa
        Map<Character, Integer> maps = new HashMap<>();
        for (char ch : s.toCharArray()){
            maps.put(ch, maps.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : maps.entrySet()){
            if(entry.getValue() % 2 != 0){
                res += entry.getValue() -1;
                val = 1;
            }
            else{
                res += entry.getValue();
            }
        }
        return res+val;

    }
    public boolean increasingTriplet(int[] nums) {
        // [1,2,3,4,5]
        if(nums.length<3){
            return false;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for(int num : nums){
            if(num <= a){
                a = num;
            }
            else if(num <= b){
                b = num;
            }
            else{
                return true;
            }
        }
        return false;
    }
    // LEETCODE 350
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> maps = new HashMap<>();
        List<Integer> lists = new ArrayList<>();

        for(int ele : nums1){
            maps.put(ele, maps.getOrDefault(ele, 0) + 1);
        }
        for(int ele : nums2){
            if(maps.containsKey(ele) && maps.get(ele) > 0){
                lists.add(ele);
            }
        }
        int [] arr = new int[lists.size()];
        for (int i = 0; i < lists.size(); i++) {
            arr[i] = lists.get(i);
        }
        return arr;
    }
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> maps = new HashMap<>();
        List<Integer> lists = new ArrayList<>();
        for(int ele : arr){
            maps.put(ele, maps.getOrDefault(ele, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : maps.entrySet()){
            lists.add(entry.getValue());
        }
        HashSet<Integer> set = new HashSet<>();

        for(int num : lists){
            if(set.contains(num)){
                return false;
            }
            set.add(num);
        }
        return true;
    }

    public static int[] asteroidCollision(int[] asteroids) {
         // [5, 10 ,-5]
       Stack<Integer> stack = new Stack<>();
       for(int num : asteroids) {
           if (num > 0) {
               stack.push(num);
           } else {
               while (!stack.isEmpty() && stack.peek() < -num) {
                   stack.pop();
               }
               if (stack.isEmpty() || stack.peek() < 0) {
                   stack.push(num);
               }
               if (stack.peek() == -num) {
                   stack.pop();
               }
           }
       }
           int [] res = new int[stack.size()];
           int i = stack.size();

           while (!stack.isEmpty()){
               res[i--] = stack.pop();
           }

       return res;
    }



    public int maxHeightOfTriangle(int red, int blue) {
       int k1 = check(red,blue);
       int k2 = check(blue, red);
       return Math.max(k1,k2);
    }
    public int check(int a, int b){
        int f = 0;
        int l = 1;
        int c =0;
        while(a > 0 || b > 0){
            if(f == 0){
                if(a >= l){
                    a -= l;
                }
                else{
                    break;
                }
            }
            else{
                if(b >= l){
                    b-=l;
                }
                else{
                    break;
                }
            }
            c++;
            l++;
            f = f^1;
        }
        return c;
    }
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n ; j++){
                if(i ==j){
                    continue;
                }
                else if((ar.get(i) + ar.get(j))% k==0)
                {
                    count++;
                }
            }
        }
        return k;

    }
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        HashMap<Integer,Integer> maps = new HashMap<>();
        for(int num : arr){
            maps.put(num, maps.getOrDefault(num,0)+1);
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> entry : maps.entrySet()){

            if(max < entry.getValue()){

                max = Math.max(entry.getValue(), max);
            } else if (max == entry.getValue()) {
                min = Math.min(min,entry.getKey());
            }
        }
        return min;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int x = 0;
        int [] ans = new int[m+n];
        while(i< m || j < n){
            if(nums1[i] == 0 || nums2[j]==0){
                continue;
            }
            else if(nums1[i] < nums2[j]){
                ans[x++] = nums1[i++];
            }
            else{
                ans[x++] = nums2[j++];
            }
        }
        nums1 = new int[ans.length];
        for (int k = 0; k < ans.length; k++) {
            nums1[k] = ans[k];
        }
    }
    public static String getEncryptedString(String s, int k) {
        if (s == null || s.length() == 0 || k < 0) {
            return "";
        }

        k = k % s.length();
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(k)); // Append the character at index k first

        // Append the remaining characters in their original order, skipping the character at index k
        for (int i = 0; i < s.length(); i++) {
            if (i != k) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
    public static void swap(char[] s, int st, int e){
        char temp = s[st];
        s[st] = s[e];
        s[e] = temp;
    }
    public static int solve(int N, List<Integer> arr){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int sum = 0;
        for(int num : arr){
            if(!set.contains(num)){
                count++;
                sum+=num;
                set.add(sum);   
            }
        }
        return count;

    }

//    public int maxProfit(int[] prices) {
//        int min = Integer.MIN_VALUE;
//        int price = prices[0];
//        for (int i = 1; i < prices.length; i++) {
//            if(prices[i])
//        }
//    }
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0 || carry ==0){
            if(i >= 0){
                carry += a.charAt(i--) - '0';
            }
            if(j >= 0){
                carry += b.charAt(j--) - '0';
            }
            sb.append(carry%2);
            carry = carry/2;
        }
        return sb.toString();

    }

    public static Map<Integer,Integer> containsNearbyDuplicate(int[] nums, int k) {
            HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        return map;

    }


    }



