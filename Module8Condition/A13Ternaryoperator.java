package Module8Condition;
import java.util.*;

public class A13Ternaryoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int x = sc.nextInt();
        System.out.println(x%2 == 0 ? "Even" : "Odd");
    }
}
