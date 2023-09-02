package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.*;
public class zigzag {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data = data;
        }
        public node(int data, node next){
            this.data = data;
            this.next = null;
        }
    }
    public static node head;
    public static void main(String[] args) {
     zigzag ll = new zigzag();
     ll.addfirst(6);
     ll.addfirst(5);
     ll.addfirst(4);
     ll.addfirst(3);
     ll.addfirst(2);
     ll.addfirst(1);
     ll.print();

    }
    public static void addfirst(int data){
       // LinkedList.zigzag.node newNode = new LinkedList.zigzag.node(data);
        node newNode = null;
        if(head == null){
            head  = newNode;
            return ;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        node temp = head;
        while(temp!= null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static node midnode(node mid){
        node slow = head;
        node fast = head.next;
        while(fast!=null &&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void reverse(){
        node curr = head;
        node prev = null;
        node next;
        while(head!=null){
            next = curr;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }


    public static void zigzagg(){
        //finding midnode
        node slow = head;
        node fast = head;
        while(fast!=null &&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        node mid = slow;
        //initialising reverse
        node curr = mid.next;
        mid.next = null;
        node prev=null;
        node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node left = head;
        node right = prev;
        node nextLeft,nextright;

        while(left!=null &&right!=null){
            nextLeft = left.next;
            left.next = right;
            nextright = right.next;
            right.next = left;
            left = nextLeft;
            right = nextright;

        }
    }
}
