package Module12Array;
import java.util.*;

public class A2basic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] array = new int[n];
        
        for(int i=0; i<=n-1; i++){
            array[i] = sc.nextInt();
        } 

        for(int i=0; i<=n-1; i++){
            System.out.print(array[i]+" ");
        }
    }
}
