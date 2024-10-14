package Module18Recursion;

import java.util.Scanner;

public class A6second {

    public static void Print(int n){
        if (n==0) {
            return;
        }
        Print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter val of n : ");
        int n = sc.nextInt();
        Print(n);
    }
}
