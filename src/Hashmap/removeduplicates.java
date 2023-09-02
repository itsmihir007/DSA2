package Hashmap;

import org.w3c.dom.Node;

import java.util.*;

public class removeduplicates {
    class Node
    {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,2,5};
        System.out.println(removeduplicate(arr));
    }
    public static ArrayList<Integer> removeduplicate(int[] arr){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer,Boolean> seen = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if(seen.containsKey(arr[i])){
                continue;
            }
            output.add(arr[i]);
            seen.put(arr[i], true);

        }
        return output;
    }
    public Node removeDuplicates(Node head)
    {
        // Your code here
        Set<Integer> map = new HashSet<>();
        Node prev = new Node(-1);

        for(Node curr = head; curr!=null; curr= curr.next){
            if(map.contains(curr.data)){
                prev = curr.next;
            }
            else{
                prev=curr;
            }
        }
return prev;
    }
    int intersectPoint(Node head1, Node head2)
    {
        // code here
        while(head2 !=null){
            Node temp = head1;
            while(temp!=null){
                if(temp ==head2){
                    return head2.data;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
return -1;
    }
//    static int majorityElement(int arr[], int size)
//    {
//        // your code here
//        int count =0;
//        LinkedHashMap<Integer,Integer> set =  new LinkedHashMap<>();
//        for (int i = 0; i <size; i++) {
//            set.put(arr[i] , )
//        }
//    }
public String isSubset( long x[], long y[], long n, long m) {
    if(n > m){
        return "No";
    }
    HashSet<Long> sets = new HashSet<>();
    HashSet<Long> set = new HashSet<>();
    for(long val : x){
        sets.add(val);
    }
    for(long val : y){
        set.add(val);
    }
    for (int i = 0; i < y.length ; i++) {
        if(sets.contains(set.contains(i))==false){
            return "No";
        }
    }
    return "Yes";

}
    public void Rearrange(int arr[], int n)
    {
        // Your code goes here
        int x = 0;
        int []ar = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                ar[x++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                ar[x++] = arr[i];
            }
        }
        for (int i = 0; i < ar.length; i++) {
            arr[i] = ar[i];
        }
    }
    public char nextGreatestLetter(char[] letters, char target) {

        int x = 0;
        int y = letters.length-1;
        while(x<=y){
            int mid = x +(y-x)/2;
            if(letters[mid]>target){
                y=mid-1;
            }
            else{
                x = mid+1;
            }
        }
        return letters[x%letters.length];
    }
    int[] kLargest(int[] arr, int n, int k) {
        // code here
//        int [] x = new int[k];
//        int s = 0;
//        for(int i = arr.length; i > n-k; i--){
//            x[s++] = arr[i];
//        }
//        return x;
        ArrayList<Integer> ar = new ArrayList<>(k);

        while(k!=0){
            ar.add(arr[n-1]);
            n--;
            k--;
        }
        int []arrr = new int[k];
        int s = 0;
        for (int i = 0; i < ar.size(); i++) {
            arrr[s++] = ar.get(i);
        }
        return arrr;
    }
}
