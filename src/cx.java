import java.util.Scanner;

public class cx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int []arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(check(arr));
    }
    public static boolean check(int [] arr){
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum+=arr[i];
                if(sum%6 == 0){
                    return true;
                }
            }
        }
        return false;
    }
}
