package StackandQueue;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> first;
    Stack<Integer> second;
    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
       first.push(x);
    }

    public int pop() {
        while(!first.empty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while(!second.empty()){
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        return first.peek();
    }

    public boolean empty() {
       return first.empty();
    }
}
