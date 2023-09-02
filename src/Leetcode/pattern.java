package Leetcode;

public class pattern {

    static void pat1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pat2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pat3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void pat4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pat5(int n){
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n -(2*i+1); j++) {
                System.out.print("*");
            }
//            for (int j = 0; j < n - i - 1; j++) {
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
    static void pat6(int n){

        for (int i =1; i <=2* n-1; i++) {
            int x = i;
            if (i > n) {
                x = 2 * n - i;
            }

            for (int j = 1; j <= x; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        }

    static void pat7(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int space = 0; space <n * 2 -i *2; space++) {
                System.out.print(" ");
            }
            for (int j = i; j >0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pat8(int n){
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    static void pat9(int n){
        for (int i = 0; i < n; i++) {
            for (char ch = 'A' ; ch<='A' + i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void pat10(int n){
        int x = 0;
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A'+i);
            for (int j =0; j <=i ; j++) {
                System.out.print(ch);

            }
            System.out.println();
        }
    }

    static void pat11(int n){
        int x = 0;
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E' ; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pat12(int n){
        for (int i = 0; i <= n; i++) {


                for (int j = n; j >= i; j--) {
                    System.out.print("*");
                }
                for (int space = 0; space < 2 * i; space++) {
                    System.out.print(" ");
                }
                for (int j = n; j >= i; j--) {
                    System.out.print("*");

            }
                System.out.println();
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int space = 0; space <(2*n)-(2*i); space++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pat13(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int space = 0; space <(2*n)-(2*i); space++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= n; i++) {


            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            for (int space = 0; space < 2 * i; space++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pat13(5);
    }
}
