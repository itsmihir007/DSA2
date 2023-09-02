package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class stackinarray {

    public static ArrayList checkmaxelemnttotheright(ArrayList<Integer>arr , int index){
        Stack<Integer> s = new Stack<>();

        int n = arr.size() - 1;
        for (int i = 0; i < n; i++) {
            if(s.size() == 0){
                s.push(-1);

            } else if (s.size() > 0 && s.firstElement() > arr.get(i)) {
                arr.add(s.firstElement());
            } else if (s.size() > 0 && s.firstElement() <= arr.get(i)) {
                while(s.size() > 0 && s.firstElement() <= arr.get(i)){
                    s.pop();
                }
                if(s.size() == 0){
                    arr.add(-1);
                }
                else{
                    arr.add(s.firstElement());
                }
                s.push(arr.get(i));
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {5, 6, 2, 4, 9, 7, 8};
        ArrayList<Integer> v = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        // push the last element to the stack
        s.push(arr[arr.length-1]);
        v.add(-1);

        for (int i = arr.length-2; i >=0; i--) {
            while(!s.isEmpty() && arr[i]>s.peek()){
                s.pop();
            }
            if(!s.isEmpty()){
                v.add(-1);
            }else{
                v.add(s.peek());
            }
            s.push(arr[i]);
        }
        ArrayList<Integer> rev = new ArrayList<>();
        for (int i = v.size(); i >=0 ; i--) {
            rev.add(v.get(i));
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "is" + rev.get(i));
        }
    }

}
