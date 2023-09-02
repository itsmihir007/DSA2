package Leetcode;
import java.util.*;
import java.util.ArrayList;

public class cutarray {
    class pair  {
        long first, second;
        public pair(long first, long second)
        {
            this.first = first;
            this.second = second;
        }
    }
    static int cutArray(int n, int[] arr) {
        // Write your code here.
        int count = 0;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                count++;
            }
        }
        return count;
    }

    public static int maxWeightCell(int N, List<Integer> Edge) {

        // Initializing temp with 0
        int[] temp = new int[N];

        // Traversing the Edge array
        for (int i = 0; i < N; i++) {

            // Checking if the value is not
            // equal to -1
            if (Edge.get(i) != -1) {

                // Adding weight to the
                // destination cell
                temp[Edge.get(i)] += i;
            }
        }

        // Getting the index with
        // maximum value
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (temp[i] > max) {
                ans = i;
                max = temp[i];
            }
        }
        return ans;
    }

    // Drivers code
    public static void main(String[] args) {
        // Size of Edge
        int N = 4;
        List<Integer> Edge = Arrays.asList(2, 0, -1, 2);

        // Printing value
      //  System.out.println(maxWeightCell(N, Edge));
        System.out.println(5 % 5);
        System.out.println(4/2);
        System.out.println(3%5);
        System.out.println(findNumber(6));
    }
    public static long findNumber(long N)
    {
        int[] arr= { 9 , 1 , 3 , 5 , 7 };
        long curr=1, ans=0;
        while(N!=0)
        {
            long index= N%5;
            ans = arr[(int)index] * curr + ans;
            if(N%5==0) N = N/5 - 1;
            else N = N/5;
            curr *=10;
        }
        return ans;
    }
//    https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1?page=1&curated[]=1&sortBy=submissions
    public pair[] allPairs( long A[], long B[], long N, long M, long target) {
        // Your code goes here
       Arrays.sort(A);
       Set<Long> set = new LinkedHashSet<>();
       ArrayList<pair> list = new ArrayList<>();
       for(long x : B){
           set.add( x);
       }
       for(long y : A){
           if(set.contains(target - y)){
               pair p = new pair(y, target-y);
               list.add(p);
           }
       }
       pair ans[] = new pair[list.size()];
        int k = 0;
       for(pair x : list){
           ans[k++] = x;
       }
       return ans;
    }
    //https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1?page=1&curated[]=1&sortBy=submissions
    static int minJumps(int[] arr){
        // your code here
       int jump = 0;
       int far =0;
       int end = 0;
       int n = arr.length-1;
        for (int i = 0; i <=n; i++) {
            far = Math.max(far, i + arr[i]);
            if(far > n){
                jump++;
                break;
            }
            if(i == far){
                return -1;
            }
            if(i == end){
                jump++;
                end = far;
            }

        }
        return jump;
    }
  //  https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
    public double average(int[] arr) {
       Arrays.sort(arr);
       int count = 0;
       double avg = 0;
       if(arr.length ==0){
           return arr[0];
       }
        for (int i = 1; i < arr.length-1; i++) {
            avg +=arr[i];
            count++;
        }
        double ans = avg/count;
        return ans;
    }
  //  https://leetcode.com/problems/sign-of-the-product-of-an-array/
    public int arraySign(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < 0){
                count++;
            }
            if(nums[i] == 0){
                return 0;
            }
        }
        if(count/2 == 0){
            return 1;
        }
        else{
            return -1;
        }
    }
    //https://practice.geeksforgeeks.org/problems/8d0e8785cef59cf4903b926ceb7100bcd16a9835/1
    public static boolean makePalindrome(int n, String[] arr) {
        // code here
        HashSet<String> set = new HashSet<>();
        for (String s : arr){
            set.add(s);
        }
        int c =0;
        for(String i : set){
            String rev = new StringBuilder(i).reverse().toString();
            if(set.contains(rev)){
                c++;
            }
        }
        if(c==arr.length){
            return true;
        }
        return false;
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arrr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int n : nums1){
            set1.add(n);
        }
        for(int n : nums2){
            set2.add(n);
        }
        for(int n : set1){
            if(set2.contains(n)==false){
                arr.add(n);
            }
        }
        for(int n : set2){
            if(set1.contains(n)==false){
                arrr.add(n);
            }
        }
        ans.add(arr);
        ans.add(arrr);
        return ans;
    }
}
