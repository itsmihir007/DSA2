package StackandQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class priorityqueue {
    public static void main(String[] args) {
        int[] arr = {55, 77, 8, 23, 1, 2};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val : arr) {
            pq.add(val);
        }
        while (pq.size() > 0) {
            System.out.println(pq.peek());
            pq.remove();
        }
        int []arr1 = {-1,7,-7,3,8};
        plusminus(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void plusminus(int[] arr) {
        int left = 0;
        int right = arr.length-1 ;


        while (left < right) {
            if (arr[left] >= 0 ) {
                left++;
            }
             else if ( arr[right] < 0) {
                right--;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

        }
    }
    public String isSubset( long x[], long y[], long n, long m) {
            if(n > m){
                return "No";
            }
        HashSet<Long> sets = new HashSet<>();
        HashSet<Long> set = new HashSet<>();
            for(long val : x){
                sets.add(val);
            }
            for(long val : y){
                set.add(val);
            }
        for (int i = 0; i < x.length - 1; i++) {
            if(!sets.contains(i)){
                return "No";
            }
        }
        return "Yes";
    }

}
