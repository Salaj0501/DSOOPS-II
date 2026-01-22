package Java.Recursion;

public class Permutation {
    public static void perm(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
        } else {
            for(int i = 0; i < str.length(); ++i) {
                char ch = str.charAt(i);
                String ros = str.substring(0, i) + str.substring(i + 1);
                perm(ros, ans + ch);
            }

        }
    }

    public static void main(String[] args) {
        perm("abc", "");
    }
}
