package Leetcode;

import java.util.*;

public class gfgpotd {
    public int klengthpref(String[] arr, int n, int k, String str)
    {
        // code here
     if(str.length()< k){
         return 0;
     }
     int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()>=k){
                if(arr[i].substring(0,k).equals(str.substring(0,k))){
                   count++;
                }
            }
        }
        return count;
    }
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][], int r, int c)
    {
        //add code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < r; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < c; j++) {
                list.add(a[i][j]);
            }
            if(!ans.contains(list)){
                ans.add(list);
            }
        }
        return ans;
    }
}
