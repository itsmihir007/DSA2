package tempakshatr;

import TREE.tree1;

public class temp {


    public static void main(String[] args) {
        System.out.println(struct(5,7));
    }
    public static int struct(int num1 , int num2){
        if(num1 > num2){
            return num1 - num2;
        } else if (num1 == num2) {
            return 0;
        } else{
            return num2- num1;
        }
    }

}
