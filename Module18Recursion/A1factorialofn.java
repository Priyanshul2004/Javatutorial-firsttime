package Module18Recursion;

import java.util.Scanner;

public class A1factorialofn {

    public static int fact(int n){
        if (n==1) {
            return 1;
        }
         return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter val of n : ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
