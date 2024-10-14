package Module16Sorting;

public class A3optamizedbubblesort {

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 7, 2, 4, 66 };
        System.out.println("Before sorting ");
        print(arr);
        int n = arr.length;

        boolean flag = true;

        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }

            if (flag == true) {
                break;
            }
        }
        System.out.println("After sorting");
        print(arr);
    }
}
