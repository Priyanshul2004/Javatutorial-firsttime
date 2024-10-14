package Module11patternprinting;
import java.util.*;

public class A5same4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of n");
        int n = sc.nextInt();
        for(int i=n; i >= 1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
