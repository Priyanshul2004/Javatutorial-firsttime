package Module8Condition;

import java.util.*;

public class A10leastin3int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value = ");
        int a = sc.nextInt();
        System.out.print("enter the second value = ");
        int b = sc.nextInt();
        System.out.print("Enter the thired value of = ");
        int c = sc.nextInt();
        if (a <= b) {
            if (a <= c) {
                System.out.println(a + " is smaller");
            }
        }else if (b <= a ) {
            if (b <= c) {
                System.out.println(b + " is smaller");
            }
        }else{
            System.out.println(c + " is smaller");
        }
    }
}
