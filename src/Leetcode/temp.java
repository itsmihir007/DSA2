package Leetcode;

public class temp {
    public static void main(String[] args) {
        long r = reverse(361);
        long ans = (int)Math.pow(361,163);
        System.out.println(ans % 1000000007);
    }
    long power(int n,int R)
    {
        //Your code here
        R = (int) reverse(n);
        long ans = (long) Math.pow(n,R);
        long ans2 = ans%1000000007;
        return ans2;

    }
    static long reverse(long x){
        //   long rem = 0;
        long reverse = 0;
        while(x  != 0)
        {
            long remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x/10;
        }
        return reverse;
    }
    static int isPossible(int n, int m, String s){
        // code here
        int row = 0;
        int col = 0;
        int minrow = 0;
        int mincol = 0;
        int maxrow = 0;
        int maxcol = 0;
        for(char ch : s.toCharArray()){
            if(ch =='L') col--;
            if(ch =='R') col++;
            if(ch =='U') row--;
            if(ch =='D') row++;
            minrow = Math.min(minrow,row);
            maxrow = Math.max(maxrow,row);
            mincol = Math.min(mincol,col);
            maxcol = Math.max(maxcol,col);
        }
        return maxrow-minrow <n && maxcol-mincol<m ?1:0;
    }
}
