package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class hack1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(1);
        arr.add(1);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        System.out.println(sockMerchant(8,arr));
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int count[]=new int[101];
        for(int i=0;i<n;i++){
            count[ar.get(i)]++;
            System.out.print(count[ar.get(i)]+ " ");

        }
        System.out.println();
        int total=0;
        for(int i=0;i<n;i++){
            total+=(count[ar.get(i)])/2;
            System.out.print(total+ " ");

            count[ar.get(i)]=0;
            System.out.print(count[ar.get(i)]+ " ");

        }
        return total;
    }
    public boolean isHappy(int n) {
        int s = n;
        int f = n;
        do{
            s = findsquare(n);
            f = findsquare(findsquare(n));
        }while (s!=f);
        if(s==f){
            return true;
        }
        return false;
    }
    public static int findsquare(int number){
        int ans = 0;
        while(number>0){
            int rem = number%10;
            ans +=rem * rem;
            number = number/10;
        }
        return ans;
    }
    }


