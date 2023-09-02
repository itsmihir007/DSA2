package Hashmap;

import java.util.HashMap;

public class largestsubarr {
    public static void main(String[] args) {
        int []arr = {15,-2,2,-8,1,7,10,23};

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int len = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(map.containsKey(sum)){
                len = Math.max(len, i-map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
        System.out.println(sum);

        System.out.println(maxsub(arr,15));
    }
    //find the max subarray sum of a given input
    public static int maxsub(int []arr , int num){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(map.containsKey(sum - num)){
                ans += map.get(sum - num);
            }
            map.put(sum, map.getOrDefault(sum , 0) +1);
        }
        return ans;
    }

}
