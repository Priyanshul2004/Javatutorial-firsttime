package Module8Condition;
import java.util.*;

public class A6Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of rectangle = ");
        int length = sc.nextInt();
        System.out.print("Breath of rectangle = ");
        int Breath = sc.nextInt();
        int areaofrect = length*Breath;
        int parimeter = 2*(length + Breath);
        if (areaofrect > parimeter) {
            System.out.println("Area of rectangle is greater = " + areaofrect);
        }else if (areaofrect == parimeter) {
            System.out.println("Both are equal");
        }else{
            System.out.println("parimeter is greater = " + parimeter);
        }
    }

}
