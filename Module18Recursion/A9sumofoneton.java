package Module18Recursion;

public class A9sumofoneton {
    public static int Printsum(int n){
        if (n == 0) {
            return 0;
        }
        return  n+Printsum(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Printsum(n));
    }
}
