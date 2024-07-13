package LinkedList;
import java.util.ArrayList;
import java.util.LinkedList;
public class LL {
    //formation of a single node

    public static class Node{
        int data;
        Node next;

        public  Node(int data, Node next){
            data = this.data;
            next = this.next;
        }
        public Node( int data){
            data = this.data;
        }

    }

    public static void addfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }



    public static Node head;
    public static Node tail;
    public static int size;

    public static int search(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;

        }
        return -1;
    }


    public static int recursivesearch(int key) {
        return helper(head, key);
    }

    private static int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public static void addinthemiddle(int index, int data) {
        if (index == 0) {
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static int removefirst() {
        int val = head.data;
        head = head.next;
        return val;

    }

    public static void reverse(Node head) {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        prev = head;
    }
    // find and remove nth node from Linked List


    public static Node findmid(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

//    public static boolean ispalindrome() {
//        if(head == null && head.next == null){
//            return true;
//        }
//        Node curr = findmid(head);
//        Node
//    }

    public static void deletefromnthindex(int n) {
        int siz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            siz++;
        }
        if (n == siz) {
            head = head.next;
            return;
        }
        int i = 1;
        int findbyn = siz - n;
        Node prev = head;
        while (i < findbyn) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

/*LL.addinthemiddle(1,9);
        removefirst();
        System.out.println(search(3));
        reverse();
        System.out.println(recursivesearch(3));*/


    public static void main(String[] args) {
        LL mm = new LL();
        mm.addfirst(5);
        mm.addfirst(4);
        mm.addfirst(3);
        mm.addfirst(2);
        mm.addfirst(1);

   //     mm.print();

       mm.zigzagg();
       LL m = new LL();
       m.head = new Node(1);
       m.head.next = new Node(2);
       m.head.next.next = new Node(3);
       m.head.next.next.next = new Node(4);
       m.print();

        System.out.println(m.recursivesearch(2));

    }
    public static void zigzagg() {
        //finding midnode
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        //initialising reverse
        Node curr = mid.next;
        //mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextright, nextLeft;

        while (left != null && right != null) {
            nextLeft = left.next;
            left.next = right;
            nextright = right.next;
            right.next = nextright;

            left = nextLeft;
            right = nextright;

        }
    }
//    public static Node modifyTheList(Node head)
//    {
//        Node curr = head;
//        int len = 0;
//        while(curr!=null){
//            len++;
//            curr = curr.next;
//        }
//        int mid = len /2;
//        curr = head;
//        if(len%2 == 0){
//            mid--;
//        }
//        int i = 0;
//        while (i!=mid){
//            curr = curr.next;
//            i++;
//        }
//        Node join = curr;
//        Node r = reversell(curr.next);
//    }
//    public static void reversell(Node head){
//        Node prev = null;
//        Node curr = head;
//        Node next = curr.next;
//        while()
//
//    }
}