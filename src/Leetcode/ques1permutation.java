package Leetcode;


import java.util.*;

public class ques1permutation {
    public static void main(String[] args) {
        int []arr = {1,2,3,6,5,4};
        System.out.println(nextPermutation(arr.length, arr));
        String s = "word";

    }
    // gfg permutation
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        int i = arr.length -2;
        while(i >= 0 && arr[i] >= arr[i+1]) i--;
        if(i >= 0){
            int j = arr.length-1;
            while(arr[j] <= arr[i]) j--;
            swap(arr, i , j);

        }
        reverse(arr,i+1,arr.length-1);
        ArrayList<Integer> ar = new ArrayList<>();
        int k =0;
        for (int j = 0; j < arr.length ; j++) {
            ar.add(arr[j]);
        }

        return ar;
    }
    public static void reverse(int []arr , int i , int j){
        while(i <j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void swap(int []arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    //https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
    public static int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int pair = 0;
        for(int i : arr){
            if(map.containsKey(k-i)){
                pair+= map.get(k-i);
            }
            map.put(i , map.getOrDefault(i,0) +1);
        }
        return pair;
    }
  //  https://practice.geeksforgeeks.org/problems/count-element-occurences/1
    public int countOccurence(int[] arr, int n, int k)
    {
        // your code here,return the answer
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(arr,0)+1);
        }
        int target = n/k;
        int count =0;
        for(Map.Entry<Integer,Integer> set : map.entrySet()){
            count+= set.getValue() > target?1 :0;
        }
        return count;
    }
}
