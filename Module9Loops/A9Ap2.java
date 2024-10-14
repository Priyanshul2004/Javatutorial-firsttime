package Module9Loops;
import java.util.*;

public class A9Ap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 4,7,10,13
        int n = sc.nextInt();
        for(int i=4; i<= 3*n+1 ; i+=3){
            System.out.println(i);
        }
    }
}
