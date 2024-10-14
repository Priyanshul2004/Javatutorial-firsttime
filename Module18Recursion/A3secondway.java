package Module18Recursion;

import java.util.Scanner;

public class A3secondway {
    public static void Print(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        Print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter val of n : ");
        int n = sc.nextInt();

        Print(n);
    }
}
