package Module11patternprinting;
import java.util.*;;

public class A4Numberpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of n");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                 System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}