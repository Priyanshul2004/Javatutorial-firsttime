package Module7Basics;
import java.util.*;

public class A13Addbyuserinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b = ");
        double b = sc.nextDouble();
        double c = a+b;
        System.out.println("The sum of a and b is = " + c);
    }    
}