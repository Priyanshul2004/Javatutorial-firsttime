package Module18Recursion;

import java.util.*;

public class A10Powerfunction {

    public static int powerf(int a, int b){
        if (b == 0) {
            return 1;
        }
        return a*powerf(a, b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter val of a ");
        int a = sc.nextInt();
        System.out.println("Enter val of b ");
        int b = sc.nextInt();

        System.out.println("Value of power of a in b = "+powerf(a, b));
    }
}
