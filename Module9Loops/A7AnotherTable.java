package Module9Loops;
import java.util.*;

public class A7AnotherTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = n*10;
        for(int i= n ;i<=z ;i+=n){
            System.out.println(i);
        }
    }
}
