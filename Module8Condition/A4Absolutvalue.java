package Module8Condition;
import java.util.*;

public class A4Absolutvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me your integer = ");
        int x = sc.nextInt();
        if (x < 0) {
            int y = x*(-1);
            System.out.println(y);
        }else{
            System.out.print(x);
        }
    }
}
