package Module7Basics;

import java.util.*;

public class A15Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x = ");
        int x = sc.nextInt();
        double y = (double) x;
        System.out.println("your half of x is = " + y/2);

        System.out.print("Enter the val of b = ");
        double b = sc.nextDouble();
        int a = (int)b;
        System.out.println(a);
    }
}
