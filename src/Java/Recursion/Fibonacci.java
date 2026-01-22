package Java.Recursion;

public class Fibonacci {
    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n == 1 ? 1 : fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i <= 7; ++i) {
            System.out.println(fibo(i));
        }

    }
}
