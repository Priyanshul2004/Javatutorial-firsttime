package Module8Condition;
import java.util.*;

public class A3devisivalby5ornot {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Give me the value");  
      int x = sc.nextInt();
      if (x%5 == 0) {
        System.out.println("Your value is divisibal by 5 :");
      }else{
        System.out.println("Your value is not disival by 5 :");
      }
    }
}
