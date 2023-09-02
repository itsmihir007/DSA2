package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class node {
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node findUnion(Node head1,Node head2)
    {
        //Add your code here.
        TreeSet<Integer> set = new TreeSet<>();
        while(head1!=null){
            set.add(head1.data);
            head1 = head1.next;
        }
        while(head2!=null){
            set.add(head2.data);
            head2 = head2.next;
        }
        Node dummy = new Node(-1);
        Node temp = dummy;
        for(int x : set){
            Node temp1 = new Node(x);
            temp.next = temp1;
            temp = temp1;
        }
        return dummy.next;
    }
    public static Node findUnion1(Node head1,Node head2){
        ArrayList<Integer> list = new ArrayList<>();
        if(head1 != null && head2 != null) {


            if (head1 != null) {
                if(!list.contains(head1.data)){
                    list.add(head1.data);
                }
                head1 = head1.next;
            }
            else if (head2 != null) {
                if (!list.contains(head2.data)) {
                    list.add(head2.data);
                }
                head2 = head2.next;
            }
        }
        Collections.sort(list);
        Node dummy = new Node(-1);
        Node temp = dummy;
        for(int x : list){
            Node temp1 = new Node(x);
            temp.next = temp1;
            temp = temp1;
        }
        return dummy.next;
    }
}
