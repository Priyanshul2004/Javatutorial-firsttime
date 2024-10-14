package Module7Basics;
import java.util.*;

public class A14Modulosopt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("value of a ");
        double a = sc.nextDouble();
        System.out.print("value of b ");
        double b = sc.nextDouble();
        double c = a%b;
        System.out.println(c);
    }
}
