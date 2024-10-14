package Module8Condition;
import java.util.*;

public class A7Threedigitnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number =");
        int x = sc.nextInt();
        if ((x > 99) && (x < 1000)) {
            System.out.println("it is three digit number = " + x);
        }else{
            System.out.println("it is not a three digit number = " + x);
        }
    }
}
