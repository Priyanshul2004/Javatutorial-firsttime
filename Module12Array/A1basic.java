package Module12Array;
import java.util.*;

public class A1basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        // arr[4] = 50;

        // System.out.println(arr[4]);
        // arr[4] = 33;
        // System.out.println(arr[4]);

        //input
        for(int i=0; i<=4; i++){
            arr[i] = sc.nextInt();
        }

        // output
        for(int i=0; i<= 4; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
