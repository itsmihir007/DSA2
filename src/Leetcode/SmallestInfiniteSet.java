package Leetcode;

import org.w3c.dom.Node;

import java.util.Arrays;

public class SmallestInfiniteSet {
    public static void main(String[] args) {
        System.out.println(2/10);
        System.out.println(6%10);
        System.out.println(38%9);
        System.out.println(Integer.toString(addDigits(38)));
    }
    public static int addDigits(int num) {
        if(num == 0) return 0;
        else if(num % 9 == 0) return 9;
        else return num % 9;
    }

}
