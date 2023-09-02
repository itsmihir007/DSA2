package StackandQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack<Integer> x = new Stack<>();
        x.push(1);
        x.push(2);
        x.push(3);
        x.push(4);
        x.push(5);
        x.push(6);
        System.out.println(x.pop()); // it will pop 6 as it comes last and
        System.out.println(x.pop()); // then 5
        System.out.println(x.pop());
        System.out.println(x.pop());
        // stacks last in first out

        Queue<Integer> list = new LinkedList<>();
        // Queue is an interface not a
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.peek());
        System.out.println(list.remove());
        System.out.println(list.remove());
    }
}
