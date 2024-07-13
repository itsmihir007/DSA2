package Hashmap;

import java.util.Arrays;
import java.util.HashSet;

public class ques1 {
//    public static void main(String[] args) {
//        int []arr = {1,2,1,2,1,2,3};
//        System.out.println(finddistinct(arr));
//
//    }
//    public static int finddistinct(int []arr){
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            set.add(arr[i]);
//        }
//        return set.size();
//    }
//    public static int[] intersection(int[] nums1, int[] nums2) {
//          HashSet<Integer> set1 = new HashSet<>();
//          for(Integer v1 : nums1){
//              set1.add(v1);
//          }
//          HashSet<Integer> set2 = new HashSet<>();
//          for(Integer v2 : nums2){
//            set2.add(v2);
//          }
//          HashSet<Integer> main_set = new HashSet<>();
//          for(Integer val : set1){
//              if(set2.contains(val)){
//                  main_set.add(val);
//              }
//          }
//          int []arr = new int[main_set.size()];
//          int j = 0;
//          for(Integer val : main_set){
//                arr[j] = val.intValue();
//                j++;
//          }
//
//return arr;
//    }

    public static void main(String[] args) {
        int[] arr = {1,2,35,6,4};
        int len = 5;
        descend(len,arr);
        System.out.println(arr);
    }
    public static void descend(int len, int []arr){
        int small, pos, i,j,temp;
        for (i = 0; i < len - 1; i++) {
            for (j = i; j < len; j++) {
                temp = 0;
                while(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int n = seats.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(seats[i] > students[i]){
                ans+= seats[i] - students[i];
            }
            else if(seats[i] < students[i]){
                ans+= students[i] -seats[i];
            }
        }
        return ans;
    }
}
