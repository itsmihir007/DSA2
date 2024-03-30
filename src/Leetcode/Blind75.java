package Leetcode;

public class Blind75 {

    public static int lastElement(int[] arrA) {
        int n = arrA.length;

        while (n > 1) {
            int[] arrB = new int[n - 1];

            for (int i = 0; i < n - 1; i++) {
                arrB[i] = arrA[i] + arrA[i + 1];
            }

            // Update arrA with the values of arrB
            System.arraycopy(arrB, 0, arrA, 0, n - 1);

            n--; // Decrease the size of the array
        }

        return arrA[0];
    }

    public static void main(String[] args) {
        int[] arr = {3, 10, 1, 9};
        System.out.println(lastElement(arr)); // Output should be 23
    }
}

