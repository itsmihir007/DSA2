package LinkedList;

import java.util.List;

public class leetcode1721 {


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

//    public ListNode mergeNodes(ListNode head) {
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode temp = head;
//        while
//    }
    public ListNode swapNodes(ListNode head, int k) {
      ListNode first = head,second = head, fast = head, slow = head;
        for (int i = 0; i < k-1 ; ++i) {
            first = first.next;
        }
        first = fast;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        second = slow;
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        return head;
    }
    long power(int n,int r)
    {
        //Your code here
        if(n<10){
            long ans = (long) Math.pow(n,n);
        }
        long rev = reverse(n);
        long ans = (long) Math.pow(n,rev);
        return ans;


    }
    public static long reverse(long x){
     //   long rem = 0;
       long reverse = 0;
        while(x  != 0)
        {
            long remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x/10;
        }
        return x;
    }

}