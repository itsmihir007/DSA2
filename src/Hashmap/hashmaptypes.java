package Hashmap;
import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class hashmaptypes {
    public static void main(String[] args) {
//        //worst time complexity O(n)
//        LinkedHashMap<String, Integer> link = new LinkedHashMap<>();
//        link.put("Mihir" , 01);
//        link.put("Erica" , 02);
//        link.put("huck", 03);
//
//        System.out.println(link);
//        //worst time complexity = O(logn)
//        TreeMap<String , Integer> tree = new TreeMap<>();
//        tree.put("Mihir" , 01);
//        tree.put("Erica" , 02);
//        tree.put("huck", 03);
//
//        System.out.println(tree);
//        HashMap<String , Integer> hm = new HashMap<>();
//        hm.put("Mihir" , 01);
//        hm.put("Erica" , 02);
//        hm.put("huck", 03);
//
//        System.out.println(hm);

        String str = "My name is Anthony";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String strToWordReverse) {

        char[] charsToWordReverse = strToWordReverse.toCharArray();
        int i = 0;
        int j = charsToWordReverse.length - 1;

        // Reverse the entire string
        while (i < j) {
            char temp = charsToWordReverse[i];
            charsToWordReverse[i] = charsToWordReverse[j];
            charsToWordReverse[j] = temp;
            i++;
            j--;
        }
        //yad a ni

        // Reverse individual words
        int m = 0;
        for (int n = 0; n < charsToWordReverse.length; n++) {
            if (charsToWordReverse[n] == ' ') {
                reverse(charsToWordReverse, m, n - 1);
                m = n + 1;
            }
        }
        // Reverse the last word
        reverse(charsToWordReverse, m, charsToWordReverse.length - 1);

        // Convert the char array back to a String
        String reversedString = new String(charsToWordReverse);
        return reversedString;

    }

    public static void reverse(char[] chars, int i, int j) {
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
    }
    public static void reversestrings(char [] chars, int i, int j) {
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
    }

    public String reverseStr(String s, int k) {
        int len = s.length()-1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < len; i+=k) {
            reversestrings(chars,i, i+=k);
        }

        String myans = new String(chars);
        return myans;
    }


    public double findMaxAverage(int[] nums, int k) {
         int j = 0; int i = 0; int n = nums.length;
         int sum = Integer.MIN_VALUE;
         double ans = 0.0;
         while(j<n){
             sum += nums[i];
             if(j-i+1 == n){
                 ans = Math.max(sum,ans);
                 sum -= nums[i++];
             }
             j++;
        }
         return ans;
    }
    private static final int[] rowDir = {-1, 1, 0, 0};
    private static final int[] colDir = {0, 0, -1, 1};
    public static int chunkOfCheese(int[][] maze) {
        int n = maze.length;
        int m = maze[0].length;

        // Boundary check for cheese position
        boolean cheeseFound = false;
        int cheeseRow = -1, cheeseCol = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maze[i][j] == 9) {
                    cheeseFound = true;
                    cheeseRow = i;
                    cheeseCol = j;
                    maze[i][j] = 1;  // Temporarily mark cheese as path for traversal
                }
            }
        }


        if (!cheeseFound) {
            return 0;
        }

        // Check if the starting point is a wall
        if (maze[0][0] == 0) {
            return 0;
        }

        // Initialize a queue for BFS
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});

        // Mark the starting point as visited
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];

            // Check if we have reached the cheese position
            if (row == cheeseRow && col == cheeseCol) {
                return 1;
            }

            // Explore the four possible directions
            for (int i = 0; i < 4; i++) {
                int newRow = row + rowDir[i];
                int newCol = col + colDir[i];

                if (isValidMove(newRow, newCol, n, m, maze, visited)) {
                    queue.offer(new int[]{newRow, newCol});
                    visited[newRow][newCol] = true;
                }
            }
        }


        return 0;
    }


    private static boolean isValidMove(int row, int col, int n, int m, int[][] matrix, boolean[][] visited) {
        return row >= 0 && row < n && col >= 0 && col < m && matrix[row][col] == 1 && !visited[row][col];
    }

}
