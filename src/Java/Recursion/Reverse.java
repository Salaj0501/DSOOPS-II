package Java.Recursion;

public class Reverse {
    public static int rev(int n, int reverse) {
        if (n == 0) {
            return reverse;
        } else {
            reverse = reverse * 10 + n % 10;
            return rev(n / 10, reverse);
        }
    }

    public static void main(String[] args) {
        System.out.println(rev(12345, 0));
    }
}
