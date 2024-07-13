package Leetcode;
import java.util.*;
public class
leetcode1249 {


}
class leetcode167{
//    public int[] twoSum(int[] numbers, int target) {
//
//    } // solved using two pointer and condition

    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)){
        return "";}
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0,gcd);
    }
    private int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] =  new int[n];
        int right[] =  new int[n];
        int left[] =  new int[n];

        //[1,2,3,4]
        left[0]=1;
        for (int i = 1; i < n ; i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        right[n-1] =1;
        for (int i = nums.length-2; i > 0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
//    public static void main (String[] args) throws java.lang.Exception
//    {
//        // your code goes here
//        Scanner x = new Scanner(System.in);
//
//        int len = x.nextInt();
//        int bre = x.nextInt();
//        if(2*(len+bre)>=1000){
//            System.out.println("YES");
//        }
//        else{
//            System.out.println("NO");
//        }
//    }  //solved

//    public static void main (String[] args) throws java.lang.Exception
//    {
//        // your code goes here
//        //3  -- 10000 - 3, 1 - 2
//        Scanner input = new Scanner(System.in);
//        int testcases = input.nextInt();
//
//        while(testcases >= 0){
//            int amount = input.nextInt();
//            int years = input.nextInt();
//            for (int i = 0; i < years; i++) {
//                if(amount >= 1000){
//                    amount = amount * 2;
//                }
//                else{
//                    amount = amount + 1000;
//                }
//            }
//            System.out.println(amount);
//            testcases--;
//        }
//    }            //scoreddddddddddddddddddddddddddddddddddddd
//    public static void main (String[] args) throws java.lang.Exception
//    {
//        // your code goes here
//        Scanner input = new Scanner(System.in);
//        int testcases = input.nextInt();
//
//        while(testcases > 0){
//            int charlen = input.nextInt();
//            String in = input.next();
//            int win =1;
//            char [] arr = in.toCharArray();
//            for (int i = 2; i < charlen; i++) {
//                if(!(arr[i-1] == arr[i-2])){
//                    win++;
//                }
//                if((arr[i-1] == arr[i-2]) && arr[i-1] ==arr[i]){
//                    win++;
//                }
//
//                else{
//                    continue;
//                }
//            }
//            System.out.println(win);
//            testcases--;
//        }
  //  } //https://www.codechef.com/viewsolution/1060272957

//    public int[] plusOne(int[] digits) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = digits.length; i >0; i--) {
//            if(digits[i] < 9){
//                digits[i] = digits[i] +1;
//            }
//            digits[i] = 0;
//        }
//        if(digits[0] == 0){
//            digits
//        }
//    }
public static boolean isSubsequence(String s, String t) {
      int sp = 0;
      int tp = 0;
      while(sp < s.length() || tp <= t.length()){
          if(s.charAt(sp) == t.charAt(tp)){
              sp++;
          }
          tp++;
      }
      return (sp == s.length());
}



//    public double findMaxAverage(int[] nums, int k) {
//        int n = nums.length;
//        int pointer = 0;
//        for (int i = 0; i < n; i++) {
//
//        }
//    }
public boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i : arr){
        map.put(i, map.getOrDefault(i,0)+1);
    }
    ArrayList<Integer> arl = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            arl.add(entry.getValue());
        }
        Collections.sort(arl);
    for (int i = 1; i < arl.size(); i++) {
        if(arl.get(i-1)==arl.get(i)){
            return false;
        }
    }
    return true;
}
    public boolean[] isArraySpecial(int[] nums) {
        ArrayList<Boolean> arr = new ArrayList<>();
        boolean [] ans = new boolean[1];
        if(nums.length == 1){
            return ans;
        }
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]%2 == nums[i]%2){
                arr.add(false);
            }
            else {
                arr.add(true);
            }
        }
        boolean [] ans2 = new boolean[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            ans2[i] = arr.get(i);
        }
        return ans;
    }
    public long sumDigitDifferences(int[] nums) {
        int sum = 0;
        int sub = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {


            if(nums[i] % 10 != nums[j]%10){
                sub += Math.abs(nums[i] % 10 - nums[j]%10);
                sum+=sub;
                sub = 0;
            } else if (nums[i]/10 != nums[j]/10) {
                sub +=Math.abs(nums[i] / 10 - nums[j]/10);
                sum += sub;
                sub = 0;
            } else if (nums[i]%10 != nums[j]/10) {
                sub +=Math.abs(nums[i] % 10 - nums[j]/10);
                sum += sub;
                sub = 0;
            } else if (nums[i] / 10 != nums[j] % 10) {
                sub +=Math.abs(nums[i] / 10 - nums[j]%10);
                sum += sub;
                sub = 0;
            }

            }
        }
        return sum;
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        //[1, 0 ,0 ,0, 1]
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0){
                int prev = (i == 0 || flowerbed[i-1] == 0)?0:1;
                int next = (i==flowerbed.length-1 || flowerbed[i+1]==0)?0:1;
                if(prev ==0 && next== 0){
                    flowerbed[i] = 1;
                    count++;
                }
        }
    }
        return count >=n;
}
    public static void main(String[] args) {
      //  System.out.println(isSubsequence("abc", "abdos"));
        int [] arr = {13,23,12};
        int n = arr.length;
        int len = Integer.toString(arr[1]).length();
        System.out.println(len);
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='('){
                stack.push(')');
            } else if (s.charAt(i) =='{') {
                stack.push('}');
            } else if (s.charAt(i)=='[') {
                stack.push(']');
            } else if (stack.isEmpty() && stack.pop()!=s.charAt(i)) {
                return false;
            }
        }
        return stack.empty();
    }
}


