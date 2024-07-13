package LinkedList;

public class fiboo {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        int fibo3 = 0;
        int fibo = fibonacci(n - 1);
        int fibo2 = fibonacci(n - 2);
        fibo3 = fibo + fibo2;
        return fibo3;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }


    public int maxProfit(int[] prices) {
        int currprice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (currprice > prices[i]) {
                currprice = prices[i];
            } else {
                profit = Math.max(prices[i] - currprice, profit);
            }
        }
        return profit;
    }
}
//    public void rotate(int[][] matrix) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//
//            }
//        }
//    }
//}


/*
I have always been drawn to the challenges of coding and enjoys nothing more than tackling complex problems and finding elegant solutions. With a solid foundation in programming languages such as Java, C++, and JavaScript, I am constantly expanding their knowledge and exploring new technologies to stay ahead of the curve.
What sets me apart is their innate ability to think outside the box and approach problems from unique angles. They have a great creative mind and enjoy coming up with innovative solutions that are both practical and user-friendly. Whether working on a project individually or as part of a team, I brings a fresh perspective and an enthusiasm for finding solutions that exceed expectations.

 */
