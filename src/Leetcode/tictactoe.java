package Leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class tictactoe {
    public static void main(String[] args) {
       int []arr = {100,180,260,310,40,535,695};
//        System.out.println(stockBuySell(arr,7));
        ArrayList<Integer> list=new ArrayList<>();
        long []a = {1,2,3,4};
        long []b ={1,2,3,4};
        System.out.println(minValue(a,b,a.length));
    }
    public static long minValue(long a[], long b[], long n)
    {
        long temp[] = new long[100];
        long k =0;
        for (long i = n-1; i > 0; i++) {
            temp[(int) i] = a[(int) i];

        }
        long sum =0;
        while(k <n){
            sum += temp[(int) k] * b[(int) k];
        }
        return sum;
    }
    static ArrayList<ArrayList<Integer>> stockBuySell(int arr[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        for(int i=1;i<n;i++){

            if(arr[i]>arr[i-1]){

                ArrayList<Integer> list=new ArrayList<>();
                list.add(i-1);
                System.out.println(list);

                list.add(i);
                System.out.println(list);

                res.add(list);
                System.out.println(res);
            }
        }
        System.out.println("final res" + res);
        return res;
    }
    public boolean isValid(String s) {
        Stack<Character> str = new Stack<>();
        for(char ch : s.toCharArray()){
            switch(ch){
                case '(':
                case '{':
                case '[':
                    str.push(ch);
                    break;
                case ')':
                    if(str.isEmpty()  || str.pop() != '('){
                        return false;
                    }
                    break;
                case '}':
                    if(str.isEmpty() || str.pop() != '{'){
                        return false;
                    }
                    break;
                case ']':
                    if(str.isEmpty() || str.pop() != '['){
                        return false;
                    }
                    break;
            }
        }
        return str.isEmpty();
    }
}
