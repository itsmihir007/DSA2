package DynamicProgramming;

import java.util.*;

public class interview {
    public static String reverse(String str){
        if(str.length() ==0){
            return str;
        }
        System.out.print(str.charAt(str.length()-1)+" ");
        reverse(str.substring(0,str.length()-1));
        return str;
    }


    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int i = 0;
       while(i < s.length()){
           if(s.charAt(i)!=s.charAt(i+1) && t.charAt(i) == t.charAt(i+1)){
              return false;
           } else if (s.charAt(i) == s.charAt(i + 1) && t.charAt(i) != t.charAt(i + 1)) {
              return false;
           }
       }
       return true;
    }
    public long nthStair(int n)
    {
        // Code here
        long []dp = new long[n+1];
        return counterpaths( n , dp);
    }
    public static long counterpaths(int n , long []dp){
        if(n == 0){
            return 0;
        }
        if(n <0){
            return 0;
        }
        if(dp[n] > 0){
            return dp[n];
        }
        long nm1 = counterpaths(n-1,dp);
        long nm2 = counterpaths(n-2,dp);
        long nm3 = counterpaths(n-3,dp);
        long cp = nm1+ nm2 + nm3;
        dp[n] = cp;
        return cp;
    }
    static int majorityElement(int arr[], int size)
    {
        // your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int element : arr) {
            if(map.containsKey(element)){
                map.put(element, map.get(element)+1);
        }
            else{
                map.put(element,1);
            }

    }

        Set<Map.Entry<Integer,Integer>> set = map.entrySet();
        for(Map.Entry<Integer,Integer> me : set){
            if(me.getValue() > arr.length/2){
                return me.getKey();
            }

        }
        return -1;
}
//    public static int smallestSubWithSum(int arr[], int n, int x) {
//        // Your code goes here
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                sum+=arr[i]+arr[j];
//
//            }
//        }
//    }
    //not solved
//    public int[] topKFrequent(int[] arr, int k) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        ArrayList<Integer> nums = new ArrayList<>();
//        int [] arrr = new int[nums.size()];
//        for (int element : arr) {
//            if(map.containsKey(element)){
//                map.put(element, map.get(element)+1);
//            }
//            else{
//                map.put(element,1);
//            }
//        }
//        int [] newarr = new int[map.size()];
//        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//            if(map.containsKey(entry.getKey())){
//                continue;
//            }
//            if(entry.getValue() > arr.length/3){
//                arr[entry.getKey()]++;
//            }
//        }
//        return arr;
//    }
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            hm.put(i,1);
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue() > nums.length/3){
                list.add(entry.getKey());
            }
        }
        return list;
    }
    //https://leetcode.com/problems/top-k-frequent-elements/solutions/3550088/python-java-c-simple-solution-easy-to-understand/
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if(!stack.empty()){
                if((ch == ')' && stack.peek() == '(' )|| (ch == '}' && stack.peek() == '{' )||( ch == ']' && stack.peek() == '[' )){
                    stack.pop();
                }
                else{
                    return false;
                }

            }
        }
        return true;
    }
    public static int getMaximum(int N, int[] arr) {
        // code here
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        int r = 0;
        for (int i =N; i > 0; i--) {
            if(sum%i == 0){
                r = i;
                break;
            }
        }
        return r;
    }
    public static int maxPathSum(int a[], int b[])
    {
        // Your code here
    int x = 0;
    int y = 0;
    int sum1 = 0;
    int sum2  = 0;
    while(x <a.length || y <b.length) {
        if (a[x] != b[y]) {
            if (a[x] > b[y]) {
                sum1 += a[x];
                x++;
                y++;
            } else if (a[x] < b[y]) {
                sum1 += b[y];
                y++;
                x++;
            }
        }
       if(x<a.length){
           sum1+=a[x];
       }
       sum1+=b[y];

    }
    return sum1;
    }
    public static void main(String[] args) {
    int [] arr = {2,3,7,10,12};
    int []ar = {1,5,7,8};
        System.out.println(maxPathSum(arr,ar));
    }
//    public int minimumCostPath(int[][] grid)
//    {
//        // Code here
//        int dp[][] = new int[grid.length][grid[0].length];
//        for (int i = dp.length; i >0; i--) {
//            for (int j = dp[0].length; j >0 ; j--) {
//                if(i == dp.length && j == dp[0].length){
//                    dp[i][j] = grid[i][j];
//                }
//                else if(i == dp.length){
//                    dp[i][j] = dp[i][j+1] + grid[i][j];
//                } else if (j == dp[0].length) {
//                    dp[i][j] = dp[i+1][j] + grid[i][j];
//                }
//                else {
//                    dp[i][j] = Math.min(dp[i+1][j] ,dp[i][j+1] ) + grid[i][j];
//                }
//            }
//        }
//    }
public int minSteps(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        if(s.length()!=t.length()){
            return -1;
        }
        int n = s.length();
    for(char ch : s.toCharArray()){
        map1.put(ch, map1.getOrDefault(ch,0)+1);
    }
    for(char ch : t.toCharArray()){
        map1.put(ch, map2.getOrDefault(ch,0)+1);
    }
    int count = 0;
    for (char ch : t.toCharArray()){
        if(!map1.containsKey(ch)){
            count++;
        }
    }
    return count;
}

        int search(String pat, String txt) {
            // code here
            Map<Character,Integer> map = new HashMap<>();
            int ans=0;
            for(int i=0;i<pat.length();i++){
                char c= pat.charAt(i);
                map.put(c,map.getOrDefault(c,0)+1);
            }
            int count =map.size();
            int len=pat.length();
            int i=0,j=0;


            while(j<txt.length()){
                char ch =txt.charAt(j);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)-1);
                    if(map.get(ch)==0){
                        count--;
                    }
                }
                if(j-i+1<len){
                    j++;
                }

                else if(j-i+1==len){
                    if(count==0){
                        ans++;
                    }
                    if(map.containsKey(txt.charAt(i))){
                        map.put(txt.charAt(i),map.get(txt.charAt(i))+1);
                        if(map.get(txt.charAt(i))==1){
                            count++;
                        }
                    }
                    i++;
                    j++;
                }
            }
            return ans;
        }
    public int[] leastPrimeFactor(int n)
    {
        // code here
        ArrayList<Integer> x = new ArrayList<>();
        int []arr = new int[n];
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
           arr[i] = i;
        }
        for(int i = 0; i * i<=n ; i++){
            if(arr[i] == i){
                for (int j = i*i; j <=n; j++) {
                    if(arr[j] == j){
                        arr[j] = j;
                    }

                }
            }
        }
        return arr;
    }
    }
