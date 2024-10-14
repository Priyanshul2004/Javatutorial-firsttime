package Module12Array;

public class A15Reversearray2technique {
    public static void main(String[] args) {
        // using two pointer
        int[] arr = { 3, 5, 4, 5, 6, 7, 8 };
        int n = arr.length;

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        int i = 0;
        int j = n - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
