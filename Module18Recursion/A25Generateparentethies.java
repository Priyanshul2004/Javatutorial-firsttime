package Module18Recursion;

import java.util.Scanner;

public class A25Generateparentethies {
    public static void printbr(int open, int close, int n , String s){
        if (s.length() == 2*n) {
            System.out.println(s);
            return;
        }
        if (open < n) {
            printbr(open+1, close, n, s+"(");
        }
        if (close < open) {
            printbr(open, close+1, n, s+")");
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        printbr(0,0,n,"");
    }
}
