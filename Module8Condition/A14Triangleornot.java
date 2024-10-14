package Module8Condition;
import java.util.*;

public class A14Triangleornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1st length : ");
        int x = sc.nextInt();
        System.out.print("2nd length : ");
        int y = sc.nextInt();
        System.out.print("3rd length : ");
        int z = sc.nextInt();
        if (x>y+z && y>x+z && z>x+y) {
            System.out.println("Triangle will fomed");
        }else{
            System.out.println("Triangle will not fomed");
        }
    }
}