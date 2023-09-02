package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class temp2 {
    class Node
    {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
//    public Node removeDuplicates(Node head)
//    {
//        // Your code here
//        Node dummy = new Node(head.data);
//        Node temp2 = dummy;
//        HashSet<Integer> set = new HashSet<>();
//        Node temp = head;
//        while(temp!= null){
//            set.add(temp.data);
//            temp = temp.next;
//        }
//        for(int i : set){
//            temp2.data = i;
//            temp2 = temp2.next;
//        }
//        return dummy;
//    }
//static Node segregate(Node head)
//{
//    // add your code here
//    ArrayList<Integer> arr = new ArrayList<>();
//    Node temp = head;
//    while(temp != null){
//        arr.add(temp.data);
//        temp = temp.next;
//    }
//    Collections.sort(arr);
//    //Node dummy = new Node(head.data);
//
//}

    public static int accenturesum(int a, int b, int m){
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if(i%m == 0){
                sum+=i;
            }
        }
        return sum;
    }
    public static int verizon(int n){
        int sum = 0;
        int mul = 1;
        if(n%2 == 0){
            while(n!=0){
                int digit = n % 10;
                sum += digit;
                n /= 10;
            }
            return sum;
        }
        else{
            while(n!=0){
                int digit = n % 10;
               mul *= digit;
                n /= 10;
            }
            return mul;
        }
    }
    public static int verizon2(int []arr, int k){
        int ans = 0;
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            int n = arr[i];
            while(n !=0){
                int digit = n%10;
                if(digit == k){
                    count++;
                }
                n/=10;
            }
            if(max <count){
                max = count;
                ans = arr[i];
            }


        }
        return ans;
    }
    public static void main(String[] args) {
        // System.out.println(verizon(11)); 0
        System.out.println(findweird(40,5));
    }
    public static int findweird(int n, int k){
        int count = 0;
        for (int i = 0; i <= n; i++) {
            int sum = sum(i);
            if(i%k !=0 && sum%k ==0){
                count++;
            }
        }
        return count;
    }
    public static int sum(int n){
        int summ=0;
        while(n!=0){
            int digit = n % 10;
            summ += digit;
            n /= 10;
        }
        return summ;
    }

}
