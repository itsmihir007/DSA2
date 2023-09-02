package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class trappingrainwater {
//    static long trappingWater(int arr[], int n) {
//        // Your code here
//        ArrayList<Integer> lsr = new ArrayList<>();
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < arr.length-1; i++) {
//            if(stack.isEmpty()){
//                lsr.add(arr.length+1);
//            } else if (!stack.empty() && stack.peek() < arr[i]) {
//                lsr.add(stack.peek());
//            } else if (stack.peek() < arr[i]) {
//                while(stack.size()>0 && stack.peek()>arr[i]){
//                    stack.pop();
//                }
//                if(stack.size() == 0){
//                    lsr.add(arr.length+1);
//                }
//            }
//
//        }
//    }
int isPalindrome(String S) {
    // code here
    int i = 0;
    //char ch = S.charAt(i);
    for (int j = S.length(); j >0; j--) {
        if(S.charAt(i)!=S.charAt(j)){
            return 0;
        }
        i++;
    }
    return 1;
}
    public static int findMoves(int n, int[] chairs, int[] passengers) {
        // code here
        Arrays.sort(chairs);
        Arrays.sort(passengers);
        int sum = 0;
        for (int i = 0; i < chairs.length; i++) {
            if(passengers[i] - chairs[i] > 0 ){
                sum += (passengers[i] - chairs[i]);
            }
            sum += 0;

        }
        return sum;
    }
}
