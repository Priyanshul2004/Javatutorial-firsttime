package Module18Recursion;

import java.util.Scanner;

public class A7printsomeofoneton {

    public static int Printsum(int n){
        if (n == 0) {
            return 0;
        }
        return n+Printsum(n-1);
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter val of n : ");
        int n = sc.nextInt();

        System.out.println(Printsum(n));
    }
}
