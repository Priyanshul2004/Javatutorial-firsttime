package Module18Recursion;

import java.util.Scanner;

public class A5oneton {

    public static void Print(int x,int n){
        if (x>n) {
            return;
        }
        System.out.println(x);
        Print(x+1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter val of n : ");
        int n = sc.nextInt();

        Print(1,n);
    }
}
