package A1Pratice;

public class P5practice {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 4, 3, 3, 37, 2, 2, 7, 7};
        int k = 3;

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) {
                arr[index] = arr[i];
                index++;
            }
        }
    }
}