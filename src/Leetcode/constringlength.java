package Leetcode;

import java.security.Key;
import java.util.*;

public class constringlength {
    public static int consecutive_string_length(String str) {
        int res = 0;
        int m = str.length() - 1;
        for (int i = 0; i < m; i++) {
            boolean[] visited = new boolean[256];
            for (int j = i; j < m; j++) {
                if (visited[str.charAt(j)] == true)
                    break;
                else {
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abcaxmdsedije";
        System.out.println(consecutive_string_length(str));
    }

    public long minValue(long a[], long b[], long n) {
        Arrays.sort(a);
        Arrays.sort(b);
        long sum = 0;
        int i = 0;
        int j = b.length;
        while (i < a.length && j > 0) {
            sum += a[i] * b[j];
            i++;
            j--;
        }
        return sum;
    }

    public static boolean isAnagramm(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        // Your code here
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < a.length(); i++) {
            set.add(a.charAt(i));
        }
        int i = 0;
        for (int j = 0; j < b.length(); j++) {
            if (!set.contains(b.charAt(j))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram(String a, String b) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            map.put(a.charAt(i++), map.getOrDefault(i, 0) + 1);
            map2.put(b.charAt(i++), map.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i <= a.length() - 1; i++) {
            if (!map.containsValue(map2.containsKey(i))) {
                return false;
            }
        }
        return true;
    }

    String UncommonChars(String a, String b) {
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i <= a.length() - 1; i++) {
            set1.add(a.charAt(i));
        }
        for (int i = 0; i < b.length(); i++) {
            set2.add(b.charAt(i));
        }
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (!set2.contains(ch)) {
                if (!list.contains(ch)) {
                    list.add(ch);
                }
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char ch = a.charAt(i);
            if (!set1.contains(ch)) {
                if (!list.contains(ch)) {
                    list.add(ch);
                }
            }
        }
        if (list.size() == 0) {
            return "-1";
        }
        String str = " ";
        Collections.sort(list);
        for (char ch : list) {
            str += ch;
        }
        return str;
    }

    int findMidSum(int[] ar1, int[] ar2, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < ar1.length - 1; i++) {
            arr.add(ar1[i]);
        }
        for (int i = 0; i < ar2.length - 1; i++) {
            arr.add(ar2[i]);
        }
        Collections.sort(arr);
        int start = 0;
        int end = arr.size();
        int mid = end - (end - start) / 2;
        return arr.get(mid) + arr.get(mid + 1);
    }

    static boolean findsum(int arr[], int n) {
        //Your code here
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i <= n - 1; i++) {
            sum += arr[i];
            if (set.contains(sum)) {
                return true;
            }

        }
        return false;
    }

    public boolean containsDuplicate(int[] nums) {
        //int max = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {

            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    int findOnce(int arr[], int n) {
        // Complete this function
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            if(map.containsValue(num)){
                map.put(arr[num], map.getOrDefault(num,0)+1);
            }
            else{
                map.put(arr[num] , 1);
            }
        }

       Set<Integer> keys = map.keySet();
        for(int num : map.keySet()){
            
        }
        return -1;
//        int count = 0;
//        for (int i = 1; i <= arr.length - 2; i++) {
//           if(arr[i-1] != arr[i] && arr[i] !=arr[i+1]){
//               return arr[i];
//           }
//        }
//        return -1;
    }
    static double medianOfArrays(int n, int m, int a[], int b[])
    {
        // Your Code Here
        ArrayList<Double> arr = new ArrayList<>(m+n-1);
        double i = 0;
        double j = 0;
        while(i<a.length && j<b.length){
            if(a[(int) i]<b[(int) j]){
                arr.add((double) a[(int) i]);
                i++;
            }
            else{
                arr.add((double) b[(int) j]);
                j++;
            }
        }
        double mid = arr.get((m+n-1)/2);
        if(arr.size()%2 !=0){
            return arr.get((int)mid);
        }
        double res = arr.get((int)mid) + arr.get((int)mid-1);
        return res/2;
    }

}
