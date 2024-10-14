package Module8Condition;
import java.util.*;

public class A12Quderant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X : ");
        int x = sc.nextInt();
        System.out.println("Enter the value of Y : ");
        int y = sc.nextInt();
        if (x>0 && y==0) {
            System.out.println("It is +x axis ");
        }else if (x>0 && y>0) {
            System.out.println("It is first Quderant");
        }else if (y>0 && x==0 ) {
            System.out.println("It is in +y axis");
        }else if (x<0 && y>0) {
            System.out.println("It is second quderant");
        }else if (x<0 && y==0) {
            System.out.println("It is in the -x Azis");
        }else if (x<0 && y<0) {
            System.out.println("It is in the thired quderant");
        }else if (x==0 && y<0) {
            System.out.println("It is -y axis");
        }else if (y<0 && x>0) {
            System.out.println("It is fourth quderant");
        }else{
            System.out.println("It is int the mule bundu");
        }
    }
}
