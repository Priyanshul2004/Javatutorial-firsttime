package Module12Array;
import java.util.*;

public class A15Reverse {
    public static void main(String[] args) {
        int[] arr = {3,4,51,4,5,5,2,8,9};

        int n= arr.length-1;

        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i=0; i<=n/2; i++){
            int j = n-1-i;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
