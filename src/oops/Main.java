package oops;

public class Main {
    public static void main(String[] args) {
        box Box = new box();
        System.out.println(Box.l + Box.h+ Box.w);
    }
    public boolean isPalindrome(String s) {
       int start = 0;
       int end = s.length();
       while(start<end){
           if(s.charAt(start)!=s.charAt(end)){
               return false;
           }
       }
       return true;
    }
    public int diagonalSum(int[][] mat) {
       int sum = 0;
        for (int i = 0, end = mat.length; i <mat.length ; i++,end--) {
            sum += mat[i][i] + mat[i][end];
            if(i == end){
                sum -= mat[i][end];
            }
        }
        return sum;

    }
    public static int hello(int java, String javaa){
        int x = 12;
        return  x;
    }
    public static int hello(String javaa, int java){
        int x = 12;
        return x;
    }
    public int countStrings(long N) {
        long MOD = 1000000007;
        int[] dp = new int[(int) (N + 1)];
        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i <= N; i++) {
            dp[i] = (int) ((dp[i - 1] + dp[i - 2]) % MOD);
        }

        return dp[(int) N];
    }
}
