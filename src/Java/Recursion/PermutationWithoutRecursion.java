package Java.Recursion;

public class PermutationWithoutRecursion {
    public static void main(String[] args) {

        String s = "abc";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) continue;

                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;

                    System.out.println("" + s.charAt(i) + s.charAt(j) + s.charAt(k));
                }
            }
        }
    }
}
