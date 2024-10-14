package Module8Condition;
import java.util.*;

public class A1evenandodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me the value which you want to check its even or odd = ");
        int x = sc.nextInt();
        if (x%2 == 0) {
            System.out.println("Your given number is " + x + " Even ");
        }else{
            System.out.println("Number "+x+" odd");
        }
    }
}
