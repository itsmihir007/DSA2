package LinkedList;

public class fiboo {
    public static int fibonacci(int n){
        if(n==0 || n==1 || n==2){
            return n;
        }
        int fibo3 = 0;
        int fibo = fibonacci(n-1) ;
        int fibo2 = fibonacci(n-2);
        fibo3 = fibo + fibo2;
        return fibo3;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

}
/*
I have always been drawn to the challenges of coding and enjoys nothing more than tackling complex problems and finding elegant solutions. With a solid foundation in programming languages such as Java, C++, and JavaScript, I am constantly expanding their knowledge and exploring new technologies to stay ahead of the curve.
What sets me apart is their innate ability to think outside the box and approach problems from unique angles. They have a great creative mind and enjoy coming up with innovative solutions that are both practical and user-friendly. Whether working on a project individually or as part of a team, I brings a fresh perspective and an enthusiasm for finding solutions that exceed expectations.

 */
