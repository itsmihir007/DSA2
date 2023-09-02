package Leetcode;

import java.util.Arrays;

public class ques1 {
    public static void main(String[] args) {
        int []arr = {4,3,0,5,1,2};
        System.out.println(Arrays.toString(returnn(arr)));
    }
    public static int [] returnn(int []arr){

        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[arr[i]] = i;
        }

        return temp;
    }                           

    public static void rotate(int arr[], int n)
    {
        int newarr [] = new int[n];

        for (int i = 0; i < n; i++) {
            newarr[i] = arr[i];

        }
        arr[0] = newarr[n-1];
        for (int i = 1; i < n; i++) {
            arr[i] = newarr[i-1];
        }
    }


    static int getMinDiff(int[] arr, int n, int k) {
        // code here

        for(int i = 0 ; i <n; i++){
            if(arr[i] >=k){
                arr[i] = arr[i] - k;
            }
            else{
                arr[i] = arr[i] + k;
            }
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        return (arr[n-1] - arr[0]);
    }
}
