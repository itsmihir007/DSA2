package Hashmap;

import java.util.*;

public class Anagrams {
    public class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int temp [] = arr;
        String x = "poet";
        String y = "toep";
        System.out.println(anagram(x,y));
        
    }
    public static boolean anagram(String x, String y){
        HashMap<Character , Integer> map = new HashMap<>();
        for (int i = 0; i < x.length(); i++) {
            map.put(x.charAt(i) , map.getOrDefault(x.charAt(i),0) +1);
        }
        for (int i = 0; i < y.length(); i++) {
            char ch = y.charAt(i);
            if(map.get(ch) !=null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch) -1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> index = new ArrayList<>();
        if(s ==0){
            index.add(-1);
            return index;
        }
        int sum =0;
        int left = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            while(sum >s){
                sum -= arr[left++];

            }
            if(sum == s){
                index.add(left+1);
                index.add(i+1);
                return index;
            }
        }
        index.add(-1);
        return index;
    }

    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int [] arrx = new int[n];
        int count = 0;
        int countel = 0;
        for (int i = 0; i < n - 1; i++) {
            if(arr[i] != 0){
                arrx[i] = arr[i];
                countel++;
            }
            else{
                count++;
            }

        }
        for (int i = countel+1; i <countel+count; i++) {
            arr[i] = arrx[i];
        }

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int len = count - n;
        if(len == 0){
            head = head.next;
        }else{
            ListNode prev = head;
            while(len -1 != 0){
                prev = prev.next;
                len--;
            }
               prev.next = prev.next.next;
            }
        return head;
        }
        public ListNode getmid(ListNode head){
                ListNode slow = head;
                ListNode fast = head;
                while(fast != null && fast.next !=null){
                    slow = slow.next;
                    fast = fast.next.next;
                }
                return slow;
        }
    public ListNode Midnode(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        //  ListNode mid = getmid(head);
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        if (count ==1){
            head = head.next;
            return head;
        }
        ListNode prev = head;
        int i =0;
        while(i < count/2){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        for (int i = 0; i <= size; i++) {
            if(!set.contains(arr[i])){
                return i;
            }
        }
        return 0;
    }

    }


