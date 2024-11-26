package A1Pratice;

public class P4quest {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 4, 3, 3, 37, 7, 7};
        int k = 3;

        int[] arr2 = new int[arr.length];
        int index = 0; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) {
                arr2[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > k) {
                arr2[index++] = arr[i];
            }
        }

        System.out.print("Final array (filtered and unfiltered): ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}

