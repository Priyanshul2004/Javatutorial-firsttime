package Module11patternprinting;
import java.util.*;

public class A1pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how much number of rows you want to print = ");
        int n = sc.nextInt();
        System.out.print("how much number of column you want to print = ");
        int k = sc.nextInt();
       for(int i=0 ; i< n ; i++){
        for(int j=0; j<k ; j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
}
