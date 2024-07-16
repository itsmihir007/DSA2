public class Main {
    public static void main(String[] args){
String s = "1337abbc3";
        int index = 0, sign = 1; // Step 1: Initialize variables

        //if (s.length() == 0) return 0; // Step 2: Handle empty string

        // Step 3: Skip leading whitespace
        while ((index < s.length()) && (s.charAt(index) == ' ')) {
            index++;
        }
        System.out.println(index);

        // Step 4: Handle optional sign
        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }
        System.out.println(index);

    }
}