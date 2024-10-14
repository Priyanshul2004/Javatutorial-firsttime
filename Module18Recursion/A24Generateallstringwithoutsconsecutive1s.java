package Module18Recursion;

import java.util.Scanner;

public class A24Generateallstringwithoutsconsecutive1s {
    public static void printstr(String s, int n) {
        int m = s.length();
        if (m == n) {
            System.out.println(s);
            return;
        } 
        
        if (m == 0 || s.charAt(m - 1) == '0') {
            printstr(s + 0, n);
            printstr(s + 1, n);
        } else {
            printstr(s + 0, n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printstr("", n);
    }
}
