package Module12Array;

import java.util.Arrays;

public class A12BuiltinMethods {
    public static void main(String[] args) {
        int[] array = { 4, 3, 42, 5, 3, 52, 57, 2, 5, 3 };
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // sort
        Arrays.sort(array);
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // for each
        for (int ele : array) {
            System.out.print(ele + " ");
        }
    }
}
