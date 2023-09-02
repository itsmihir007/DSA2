package Leetcode;

import java.util.Arrays;

public class que1 {
    public int[] twoSum(int[] nums, int target) {
        int []arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    arr[0] = nums[i];
                    arr[1] = nums[j];
                }
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        nintydegree(arr);
        System.out.println((Arrays.deepToString(arr)));
    }
    public static void nintydegree(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[i][j] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length -1 - j];
                arr[i][arr.length -1 - j] =temp;
            }
        }
    }
}
