package Module16Sorting;

public class A7Selectionsot {

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 20, 7, -9, 9, 8 };
        print(arr);

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int mididx = -1;

            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mididx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mididx];
            arr[mididx] = temp;
        }
        print(arr);
    }
}