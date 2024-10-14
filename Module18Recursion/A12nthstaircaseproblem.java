package Module18Recursion;
import java.util.*;
public class A12nthstaircaseproblem {

    public static int stair(int n){
        if (n==1) {
            return 1;
        }
        if (n==2) {
            return 2;
        }
        return stair(n-1)+stair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n = ");
        int n = sc.nextInt();

        System.out.println("Total ways = "+stair(n));
    }
}
