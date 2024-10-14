package Module18Recursion;

public class A8tableoftwo {
    public static void Print(int n, int x) {
        if (x > 10) {
            return;
        }
        System.out.println((n * x));
        Print(n, x + 1);
    }

    public static void main(String[] args) {
        int n = 2;
        int startMultiplier = 1;
        Print(n, startMultiplier);
    }
}