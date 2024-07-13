package DynamicProgramming;
import java.util.*;

public class fibonacci {
    public static int fibo(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }
        int ans1, ans2;
        if (dp[n - 1] == -1) {
            ans1 = fibo(n - 1, dp);
        } else {
            ans1 = dp[n - 1];
        }
        if (dp[n - 1] == -1) {
            ans2 = fibo(n - 2, dp);
        } else {
            ans2 = dp[n - 2];
        }
        int myans = ans1 + ans2;

        return myans;
    }


    public static int findfactorial(int n) {
        if (n == 1) {
            return n;
        }
        int x = findfactorial(n - 1);
        int m = n * x;
        return m;
    }

    static int setBits(int N) {
        // code here
        int count = 0;
        String str = Integer.toBinaryString(N);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 1) {
                count++;
            }
        }
        return count;
    }

    public int[] searchRange1(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        if (nums.length == 0 && nums[0] == target) {
            list.get(0);
            list.get(0);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }
        if (list.isEmpty() || nums.length == 0) {
            list.add(-1);
            list.add(-1);
        }
        int[] arr = {-1, -1};
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = end - (end + start) / 2;
            if (nums[mid] == target) {
                ans[0] = mid;
                end = mid - 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }
        }
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = end - (end + start) / 2;
            if (nums[mid] == target) {
                ans[1] = mid;
                end = mid - 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }
        }
        return ans;
    }

    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {

                }
            }
        }
    }

    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) count0++;
            if (nums[i] == 1) count1++;
            if (nums[i] == 2) count2++;
        }
        for (int i = 0; i < count0; i++) {
            nums[i] = 0;
        }
        for (int i = count0; i < count1 + count0; i++) {
            nums[i] = 1;
        }
        for (int i = count0 + count1; i < count0 + count1 + count2; i++) {
            nums[i] = 2;
        }
    }

    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        int n = goal.length();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j--) {
                if (s.charAt(i) != goal.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    int print2largest(int arr[], int n) {
        int min = Integer.MIN_VALUE;
        int min2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min2 && arr[i] != min) {
                min2 = arr[i];
            }
        }
        return min2;
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int result = n * (n + 1) / 2;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += nums[i];
        }
        return result - count;
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int ones = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ones++;
                max = Math.max(ones, max);
            } else {
                ones = 0;
            }
        }
        return max;
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            } else {
                map.put(i, 0);
            }
        }
        for (Map.Entry<Integer, Integer> keys : map.entrySet()) {
            if (keys.getKey() == 1) {
                return keys.getValue();
            }
        }
        return -1;
    }

    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        int x = 0;
        int even = 0;
        int odd = 1;
        for (int i = 0; i < arr.length; i++) {
            while (x < arr.length) {
                if (nums[x] > 0) {
                    arr[even] = nums[x];
                    even++;
                    even++;
                } else if (nums[x] < 0) {
                    arr[odd] = nums[x];
                    odd++;
                    odd++;
                }
                x++;
            }

        }
        return arr;
    }

    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int len = 0;
        int max = 0;
        int n = nums.length;
        while (j < n) {
            sum += nums[j++];
            while (sum >= target) {
                sum -= nums[i++];
                max = Math.min(max, j - i);
            }
        }
        if (max == Integer.MAX_VALUE) {
            return 0;
        }
        return max;
    }

    //    public static int lenOfLongSubarr (int nums[], int N, int target) {
//        //Complete the function
//        ArrayList<Integer> arr = new ArrayList<>(N+1);
//        arr.set(0,0);
//        int i = 0;
//        int j = 0;
//        int sum = 0;
//        for (int k = 1; k < arr.size(); k++) {
//             arr.set(0,k);
//        }
//        for (int k = 0; k < nums.length; k++) {
//            sum+=nums[i];
//
//        }
//    }
    public static String removeOuterParenthesess(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (stack.size() > 0) {
                    sb.append(ch);
                }
                stack.push(ch);
            } else {
                stack.pop();
                if (stack.size() > 0) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }

//    public static void main(String[] args) {
//
//        String str = "(()())(())";
//
//        int dp [] = new int[5];
//        System.out.println(removeOuterParenthesess(str));
//        System.out.println(fibo(5, dp));
//
//
//    }

    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (!stack.empty()) {
                    sb.append(ch);
                }
                stack.push(ch);
            } else {
                stack.pop();
                if (!stack.empty()) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i > 0; i--) {
            if (words[i] != "") {
                sb.append(words[i]);
                sb.append(" ");
            }
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public String largestOddNumber(String num) {
        if (num.charAt(num.length() - 1) % 2 == 1) {
            return num;
        }
        int i = num.length() - 1;
        while (i >= 0) {
            if (num.charAt(i) == 0) {
                i--;
            }
        }
        return num.substring(0, i + 1);
    }

    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        String e = strs[strs.length - 1];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(str.length(), e.length()); i++) {
            if (str.charAt(i) == e.charAt(i)) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder();
        if (s.length() != goal.length()) {
            return false;
        }
        sb.append(goal);
        sb.append(goal);
        String t = sb.toString();
        if (t.contains(s)) {
            return true;
        }
        return false;
    }
//    public String reverseWords(String s) {
//        // The word is a puzzle
//        // puzzle a is word the
//        char [] ch = s.toCharArray();
//        char [] ans = new char[ch.length];
//        for(int i = ch.length; i > 0 ; i--){
//            ans[i] = ch[i];
//        }
//    }

    public static int maxArea(int[] height) {
        int n = height.length;
        int left = 0 ;
        int right = n - 1;
        int ans =0;
        int maxarea = 0;
        while(left < right){
            maxarea = (Math.min(height[left],height[right]) * (right - left));
            ans = Math.max(ans,maxarea);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < gain.length; i++) {
            sum+=gain[i];
            ans = Math.max(ans, sum);
        }
        if(ans < 0){
            return 0;
        }
        return ans;
    }

    public int pivotIndex(int[] nums) {
        int total =0;
        for(int i : nums){
           total += nums[i];
        }
        int lefttotal = 0;
        for (int i = 0; i < nums.length; i++) {
             int righttotal = total - lefttotal - nums[i];
             if(righttotal == lefttotal){
                 return i;
             }
             lefttotal += nums[i];
        }
return -1;
    }
}

















