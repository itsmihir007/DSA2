package Leetcode;

public class substring {
    public int strStr(String a, String b) {
        int alength = a.length();
        int blength = b.length();
        if(alength<blength){
            return -1;
        }
        for (int i = 0; i < alength - blength; i++) {
            int j =0;
            while(j < blength && a.charAt(i+j) ==b.charAt(j)){
                j++;
                if(j == blength){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(bulbSwitch(5));
    }

    public static int bulbSwitch(int n) {
        return (int)Math.sqrt( n);
              //  1472641933
    }
}
