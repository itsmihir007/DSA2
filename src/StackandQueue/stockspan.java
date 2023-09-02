package StackandQueue;

import java.util.ArrayList;

import java.util.Stack;

// ...

public class stockspan {

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

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            if (al.size() == 0) {
                al.add(-1);
            } else if (!stack.isEmpty() && stack.peek().first > prices[i]) {
                al.add(stack.peek().second);
            } else if (!stack.isEmpty() && stack.peek().first < prices[i]) {
                while (!stack.isEmpty() && stack.peek().first > prices[i]) {
                    stack.pop();
                }
                if (al.size() == 0) {
                    al.add(-1);
                } else {
                    al.add(stack.peek().second);
                }
                stack.push(new Pair<>(i, prices[i]));
            }

        }

    }
//    public  ArrayList<Integer> stockspanpro(int [] arr){
//        int[] prices = {100, 80, 60, 70, 60, 75, 85};
//        Stack<Pair<Integer, Integer>> stack = new Stack<>();
//        ArrayList<Integer> al = new ArrayList<>();
//        for (int i = 0; i < prices.length; i++) {
//            if (al.size() == 0) {
//                al.add(-1);
//            } else if (!stack.isEmpty() && stack.peek().first > prices[i]) {
//                al.add(stack.peek().second);
//            } else if (!stack.isEmpty() && stack.peek().first < prices[i]) {
//                while (!stack.isEmpty() && stack.peek().first > prices[i]) {
//                    stack.pop();
//                }
//                if (al.size() == 0) {
//                    al.add(-1);
//                } else {
//                    al.add(stack.peek().second);
//                }
//
//            }
//            stack.push(new Pair<>(i, prices[i]));
//        }
//        System.out.println(al);
//        //return al;
//    }
}