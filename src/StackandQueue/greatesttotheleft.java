package StackandQueue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class greatesttotheleft {
    public static void main(String[] args) {
        int []arr = {1,3,2,4};
        ArrayList<Integer> arrl = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length-1; i >=0; i--) {
            if(stack.size() ==0){
                arrl.add(-1);
            } else if (stack.size() >0 && stack.peek() >arr[i]) {
                arrl.add(stack.peek());
            } else if (stack.size() > 0 && stack.peek() <= arr[i]) {
                while(stack.size() > 0 && stack.peek() <=arr[i]){
                    stack.pop();
                }
                if(stack.size() ==0){
                    arrl.add(-1);
                }
                else{
                    arrl.add(stack.peek());
                }
            }
            stack.push(arr[i]);
        }
        Collections.reverse(arrl);
        System.out.println(stack);
        System.out.println(arrl);
    }
    public boolean validateStackSequences(int[] pushed, int[] popped) {
            Stack<Integer> stack = new Stack<>();
            int j = 0;

            for(int val : pushed){
                if(!stack.isEmpty() && stack.peek() == popped[j]){
                    stack.pop();
                    j++;
                }
            }
            return stack.isEmpty();
    }
}
