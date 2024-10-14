package Module18Recursion;

import java.util.Scanner;

public class A4oneton {
    static int n;
    public static void Print(int x){
        if (x>n) {
           return; 
        }
        System.out.println(x);
        Print(x+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter val of n : ");
        n = sc.nextInt();

        Print(1);
    }
}
