package StackandQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
            int [] arr = {0,9};
        System.out.println(largestarea(arr));
    }
    public static class Pair<T1, T2> {
        private final T1 first;
        private final T2 second;

        public Pair(T1 first, T2 second) {
            this.first = first;
            this.second = second;
        }

        public T1 getFirst() {
            return first;
        }

        public T2 getSecond() {
            return second;
        }
    }
    public static ArrayList<Integer> histoleft(int []arr){
        ArrayList<Integer> left = new ArrayList<>();
        Stack<Pair<Integer,Integer>> stack = new Stack<>();

        for (int i = 0; i <=arr.length-1; i++) {
            if(stack.size() ==0){
                left.add(-1);
            } else if (stack.size() >0 && stack.peek().first <arr[i]) {
                left.add(stack.peek().second);
            } else if (stack.size() > 0 && stack.peek().first >= arr[i]) {
                while(stack.size() > 0 && stack.peek().first >=arr[i]){
                    stack.pop();
                }
                if(stack.size() ==0){
                    left.add(-1);
                }
                else{
                    left.add(stack.peek().second);
                }
            }
            stack.push(new Pair<>(arr[i], i));
        }
       // Collections.reverse(left);

        return left;
    }
    public static ArrayList<Integer> historight(int []arr){
        ArrayList<Integer> right = new ArrayList<>();
        Stack<Pair<Integer,Integer>> stack = new Stack<>();

        for (int i = arr.length-1; i >=0; i--) {
            if(stack.size() ==0){
                right.add(arr.length);
            } else if (stack.size() >0 && stack.peek().first <arr[i]) {
                right.add(stack.peek().second);
            } else if (stack.size() > 0 && stack.peek().first >= arr[i]) {
                while(stack.size() > 0 && stack.peek().first >=arr[i]){
                    stack.pop();
                }
                if(stack.size() ==0){
                    right.add(arr.length);
                }
                else{
                    right.add(stack.peek().second);
                }
            }
            stack.push(new Pair<>(arr[i], i));
        }
      Collections.reverse(right);

        return right;
    }
    public static int largestarea(int [] arr){
        ArrayList<Integer> rightarr =  historight(arr);
        ArrayList<Integer> leftarr = histoleft(arr);
        int k = 0;
        int[]width = new int[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            width[k] = rightarr.get(i) - leftarr.get(i) -1;
            k++;
        }
        int max = 0;
        for (int i = 0; i < width.length - 1; i++) {
            int product = width[i] * arr[i];
            if(product > max){
                max = product;
            }
        }
        return max;
    }

}
