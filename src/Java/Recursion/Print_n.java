package Java.Recursion;

public class Print_n {
    public static void print(int n) {
        if (n != 0) {
            print(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}
