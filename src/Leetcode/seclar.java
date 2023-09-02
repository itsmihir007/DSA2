package Leetcode;

public class seclar {
    public static void main(String[] args) {
    long [] arr = {1,3,5,2,2};
    System.out.println(equilibriumPoint(arr,arr.length-1));
    }
    public static int secondlar(int []arr) {
        int max = Integer.MIN_VALUE;
        int min = 0;
        for (int i = 0; i < arr.length-1; i++) {
            max = Math.max(max,i);
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]!=max){
                min = Math.max(Integer.MIN_VALUE,i);
            }
        }
        return min;
    }
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i] + arr[i-1];
        }

        if(arr[0] == arr[arr.length - 1]){
            return 1;
        }

        for(int i=1; i<arr.length; i++){
            if(arr[i-1] == (arr[n-1] - arr[i])){
                return i + 1;
            }
        }
        return -1;
    }
}
