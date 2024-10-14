package Module16Sorting;

import java.lang.reflect.Array;
import java.util.*;

public class A11Megorityelementnby2times {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,1,1,1,1,1};
        int n = arr.length/2;

        Arrays.sort(arr);

        System.out.println(arr[n]);

    }
}
