package oops;

import java.util.Arrays;
import java.util.*;

// A class in class outer class cannot be static
public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        //System.out.println("I am in Static Block");
        b = a + 5;
    }

//    public static void main(String[] args) {
//        StaticBlock obj = new StaticBlock();
//        System.out.println(StaticBlock.a + " " + StaticBlock.b);
//
//        StaticBlock.b += 3;
//
//        System.out.println(StaticBlock.a + " " + StaticBlock.b);
//
//        StaticBlock obj2 = new StaticBlock();
//
//        System.out.println(StaticBlock.a + " " + StaticBlock.b);
//
//        Arrays.toString(new int[]{1, 3, 4, 5});
//    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int len = word1.length() + word2.length();
        int x = word1.length();
        int y = word2.length();
        for (int i = 0; i < len; i++) {
            if (x > 0) {
                sb.append(word1.charAt(i));
                x--;
            }
            if (y > 0) {
                sb.append(word2.charAt(i));
                y--;
            }
        }
        return sb.toString();
    }

    //    public String gcdOfStrings(String str1, String str2) {
//        StringBuilder sb = new StringBuilder();
//        int x = 0;
//        int y = 0;
//        for (int i = 0; i < str2.length(); i++) {
//            if()
//        }
//    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largest = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > largest) {
                largest = candies[i];
            }
        }
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            ans.add((candies[i] + extraCandies) > largest);
        }
        return ans;
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int ones = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                ones++;
            }
        }
        int len = flowerbed.length;
        return true;
    }

    public int returnToBoundaryCount(int[] nums) {
        int x = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == 0) {
                x++;
            }
        }
        return x;
    }
//    public int minimumTimeToInitialState(String word, int k) {
//        StringBuilder sb = new StringBuilder();
//
//        int i = 0;
//        for (int j = 0; j < k; j++) {
//            sb.append(word.charAt(j));
//        }
//        if(word.length()%2 ==0){
//        for (int j = word.length(); j >k ; j--) {
//
//        }
//    }

    //[1,0,0,0,1]

    public static String reverseVowels(String s) {
      Set<Character> set = new HashSet<>();
      char [] arr = {'a','e','i','o','u','A','E','I','O','U'};

      for(char i : arr){
          set.add(i);
      }

      StringBuilder str = new StringBuilder(s);
      int left = 0;
      int right = s.length()-1;
      while(left<right){
          if(!set.contains(str.charAt(left))){
              left++;
          }
          else if(!set.contains(str.charAt(right))){
              right--;
          }
          if(set.contains(str.charAt(left)) && set.contains(str.charAt(right))){
              char temp = str.charAt(left);
              str.setCharAt(left++, str.charAt(right));
              str.setCharAt(right--,temp);
          }
      }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("flower"));
    }

//    public boolean canPlaceFlowers(int[] flowerbed, int n) {
//
//    }
}

