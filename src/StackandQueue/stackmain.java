package StackandQueue;

public class stackmain {

    public static void main(String[] args) throws customstack2.stackException {
        customstack2 x = new customstack2(3);
        for (int i = 0; i <= 5; i++) {
            x.push(i);
        }
        System.out.println(x);
    }

}
