package LinkedList;

import java.util.LinkedList;

public class linkedlist {
    public static class Node {
        public int data;
        public Node next;

        //here we created a block named node having data and the address of next node
        public Node(int data) {
            this.data = data;
            // this keyword is used to specify the word data specify the upper data statement so it cannot be confused
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        //this shows Node contains all the data
    }

    public static Node head;

    public static void addfirst(int value) {
        Node newnode = new Node(value);
        if (head == null) head = newnode;
        else {
            newnode.next = head;
            head = newnode;
        }
    }

    public static void print() {
        if (head == null) System.out.println("Underflow");
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + "->");
            pointer = pointer.next;
        }
        System.out.println();
    }

    public static boolean detectloops() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast.data == slow.data)
                return true;
        }
        return false;
    }


    public static void removecycle() {
        Node slow = head;
        Node fast = head.next;
        boolean cycle = false;
        while (fast == null && fast.next == null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle = false) {
            return;
        }
        Node prev = null;// last node
        slow = head;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public static Node midnode(Node head) {

        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = midnode(head);
        Node righthead = mid.next;
        mid.next = null;
        Node newleft = mergesort(head);
        Node newright = mergesort(righthead);
        //merge
        return merge(newleft, newright);
    }

    private static Node merge(Node left, Node right) {
        Node mergeold = new Node(-1);
        Node temp = mergeold;
        while (left == null && right == null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }
        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return mergeold.next;
    }

    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node curr = dummy;
        int carry = 0;

        while (l1.next != null || l2.next != null || carry == 1) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            Node node = new Node(sum % 10);
            curr.next = node;
            curr = curr.next;
        }
        return dummy;
    }

    public static boolean isPalindrome(Node head) {
        if (head == null) {
            return true;
        }
        Node mid = getmid(head);
        Node reversenode = reverse(mid);
        while (reversenode != null) {
            if (reversenode.data != head.data) {
                return false;
            }
            reversenode = reversenode.next;
            head = head.next;
        }
        return true;
    }

    public static Node getmid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        linkedlist mm = new linkedlist();
        LinkedList<Integer> xx = new LinkedList<>();
        mm.addfirst(1);
        mm.addfirst(6);
        mm.addfirst(5);
        mm.addfirst(3);

        mm.addfirst(9);
        //   mm.addfirst(8);
        mm.print();
        mm.head = mm.mergesort(mm.head);
        mm.print();

        LinkedList<Integer> ll = new LinkedList<>();

        head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println(isPalindrome(head));

    }
}
//    public static Node modifyTheList(Node head)
//    {
//        Node temp = head;
//        int count = 0;
//        while(head!=null && head.next !=null){
//            temp = temp.next;
//            count++;
//        }
//        Node mid = midnode(head);
//        while(temp!=null && temp.next!=mid){
//
//
//        }
//    }
//}
