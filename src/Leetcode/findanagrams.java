package Leetcode;

import java.util.*;

public class findanagrams {

    public static int [] interchange(int [] s){
        int i = 0;
        while(i<s.length){
            s[i] = s[s[i]];
            i++;
        }
        return s;
    }

    public static int search(String pat, String txt) {
        // code here
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < pat.length(); i++) {
            char c = pat.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = map.size();
        int len = pat.length();
        int i = 0, j = 0;


        while (j < txt.length()) {
            char ch = txt.charAt(j);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    count--;
                }
            }
            if (j - i + 1 < len) {
                j++;

            } else if (j - i + 1 == len) {
                if (count == 0) {
                    ans++;
                }
                System.out.println();
                if (map.containsKey(txt.charAt(i))) {
                    map.put(txt.charAt(i), map.get(txt.charAt(i)) + 1);

                    if (map.get(txt.charAt(i)) == 1) {
                        count++;
                    }
                }
                i++;
                j++;
            }
        }
        return ans;
    }


    public static int findanagramss(String pattern, String txt) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int count = map.size();
        int len = pattern.length();
        int i = 0;
        int j = 0;
        int ans = 0;
        while (j < txt.length()) {
            char c = txt.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    count--;
                }
            }
            if (j - i + 1 < len) {
                j++;
            } else if (j - i + 1 == len) {
                if (count == 0) {
                    ans++;
                }
                char ch = txt.charAt(i);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) - 1);
                    if (map.get(ch) == 1) {
                        count++;
                    }
                    i++;
                    j++;
                }

            }
        }
        return ans;
    }
    public static ArrayList<Integer> findUnio(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        HashSet<Integer> set= new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : arr1){
            set.add(i);
        }
        for(int i : arr2){
            set.add(i);
        }
        for(int i : set){
            arr.add(i);
        }
        Collections.sort(arr);
        return arr;
    }
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int j = 0;
        int prev = -1;
        while(i <  m && i < n){
            if(arr1[i]<arr2[j] ){
                    if(arr1[i] != prev){
                        arr.add(arr1[i]);
                        prev = arr1[i];
                    }
                    i++;
            }
            else if(arr1[i]<arr2[j] ){
                if(arr2[j] != arr2[prev]){
                    arr.add(arr2[j]);
                    prev = arr2[j];
                }
                j++;
            }
            if(arr1[i] == arr2[j]){
                arr.add(arr1[i]);
            }
        }
        return arr;
    }

//    public static int LargButMinFreq(int arr[], int n) {
//        // Your code here
//        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
//        for (int i : arr) {
//            map.put(i, map.getOrDefault(i,0)+1);
//        }
//
//    }
//    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
//        //code here
//        ArrayList<String> arr = new ArrayList<>();
//        for(String str : Dictionary){
//            int j = 0;
//            for (int i = 0; i < str.length(); i++) {
//                if(str.charAt(j) >=; 'A' && str.charAt(j)<= 'Z'){
//
//                }
//            }
//        }

//    }

    public static int ans(int [] ener){
        int max = Integer.MIN_VALUE;
        int x = 0;
        for (int i = 0; i < ener.length; i++) {
            for (int j = i+1; j < ener.length; j++) {
                x = ener[i] *ener[j];
                if(x>max){
                    max = ener[i]+ener[j];
                }

            }
        }
        return max+1;
    }
    public static int ans2 (int []ener){
        int i = 0;
        int j = ener.length-1;
        int max = Integer.MIN_VALUE;
        while(j>0){
            int x = ener[i] +ener[j];
            max = Math.max(x,max);
            j--;
        }
        return max;
    }
    public static void main(String[] args) {
        int s[] = {9,-3,8,-6,-7,8,10}; 
       // System.out.println(ans2(s));
        System.out.println(4/2);
    }
public static long[] xy(long [] arr,int n){
    long [] a = new long[n];
    a[0] = 0;
    long sum = 0;
    for(int i = 1; i<n;i++){
        int x = i /2;
        sum = (arr[i] - arr[x] )+ sum;
        a[i] = Math.abs(sum);
    }
    return a;
}
}

