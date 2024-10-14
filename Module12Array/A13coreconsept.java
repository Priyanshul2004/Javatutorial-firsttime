package Module12Array;
import java.util.Arrays;
public class A13coreconsept {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7};
        int[] array = arr;    // shallow copy

        array[0] = 22;
        System.out.println(arr[0]);
        
        // deep copy

        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] = 33;

        System.out.println(arr[0]);

    }
}
