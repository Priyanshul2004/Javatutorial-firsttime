package Module8Condition;

import java.util.*;

public class A9largestin3integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value = ");
        int a = sc.nextInt();
        System.out.println("enter the second value = ");
        int b = sc.nextInt();
        System.out.println("Enter the thired value of = ");
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println("A is grater " + a);
        } else if (b >= a && b >= c) {
            System.out.println("B is grater " + b);
        }else{
            System.out.println("C is grater "+c );
        }
    }
}
