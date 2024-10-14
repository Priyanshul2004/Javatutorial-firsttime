package Module18Recursion;

import java.util.Scanner;

public class A27mazepath {
    public static int mazepath(int rows, int column,int n,int m){
        
        if (rows == n || column == n) {
            return 1;
        }

        int rightways = mazepath(rows, column+1, n, m);
        int downways = mazepath(rows+1, column, n, m);
        return rightways+downways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows = ");
        int n = sc.nextInt();
        System.out.println("Enter column = ");
        int m = sc.nextInt();
        System.out.println(mazepath(1,1,m,n));
    }
}
