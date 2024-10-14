package Module18Recursion;

import java.util.Scanner;

public class A2print1ton {

    public static int Print(int n) {
        if (n == 0) {
            return 1;
        }
        System.out.println(n);
        return Print(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter val of n : ");
        int n = sc.nextInt();

        Print(n);
    }
}
