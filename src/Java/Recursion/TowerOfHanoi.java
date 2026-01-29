package Java.Recursion;

public class TowerOfHanoi {
    public static void Hanoi(int n,char source,char helper , char destination){
        if(n==0) return;
        Hanoi(n-1,source,helper,destination);
        System.out.println("Move disk "+ n + " from "+source + " to "+destination);
        Hanoi(n-1,destination,source,helper);
    }
    public static void main(String[] args) {
        int discs=3;
        Hanoi(discs,'A','B','C');
    }
}
