package Leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class gfg1 {
public static class Node {
    int data;
    Node next;
    public Node(){
        this.data = data;
        this.next = null;
    }
    public Node(int data){
        this.data = data;
    }
}
public static Node head;

    static Node mergeSort(Node head) {
        // add your code here
        Node mid = getmid(head);
        Node righthead = mid.next;
        mid.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(righthead);
        return merge(left,right);

    }
    static Node merge(Node left, Node right){
        Node mergell = new Node();
        Node temp = mergell;
        while(left != null && right !=null){
            if(left.data<= right.data){
                temp.next = left;
                left = left.next;
                temp = temp.next;
            }
            else{
                temp.next = right;
                right =right.next;
                temp =temp.next;
            }
        }
        while(left!=null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while(right!=null){
            temp.next = right;
            right =right.next;
            temp =temp.next;
        }
        return mergell.next;
    }
    static Node getmid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast !=null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[n-1]);
        for (int i = n-2; i >= 0; i--) {
            if(!stack.isEmpty() && arr[i]>= stack.peek()){
                stack.push(arr[i]);
            }
        }
        while(!stack.isEmpty()){
            al.add(stack.pop());
        }
        return al;
    }
}