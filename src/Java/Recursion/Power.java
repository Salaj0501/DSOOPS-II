package Java.Recursion;

import java.util.Scanner;

public class Power {
    public static int pow(int a, int p) {
        return p == 0 ? 1 : a * pow(a, p - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pow(2, 3));
    }
}
