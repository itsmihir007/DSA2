package Leetcode;

public class slidingwindow {
    public static void main(String[] args) {
        int []arr = {1,2,3,5,6,7,8,9,8,1};
        System.out.println(slid(arr,3));
    }
    public static int slid(int []arr , int k){
        int sum = 0;
        int max = 0;
        int j = 0;
        int i = 0;

            while(j < arr.length -1){

                sum +=arr[j];
                if(j-i+1 < k){
                    j++;
                } else if (j - i + 1 == k) {
                    max = Math.max(max, sum);
                    sum = sum - arr[i];
                    i++;j++;
                }
                 //   System.out.println(max);
            }

        return max;
    }
}
