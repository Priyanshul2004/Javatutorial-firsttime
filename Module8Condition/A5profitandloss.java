package Module8Condition;

import java.util.*;

public class A5profitandloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me your Cost prize = ");
        int cp = sc.nextInt();
        System.out.print("Give me your selling prize = ");
        int sp = sc.nextInt();
        if (cp < sp) {
            int profit = sp - cp;
            System.out.println("Your made profit of " + profit);
        } else if (cp == sp) {
            System.out.println("You made no profit no loss");
        } else {
            int loss = cp - sp;
            System.out.println("You made loss " + -(loss));
        }
    }
}
