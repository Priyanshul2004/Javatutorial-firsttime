package Module9Loops;
import java.util.*;

public class A8AP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 1,3,5,7
        for(int i=1 ; i<=2*n-1;i+=2){
            System.out.println(i);
        }
    }
}