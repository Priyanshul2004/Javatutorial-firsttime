package A1Pratice;

public class P7arr {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
//         Input: arr = {5, 2, 8, 1, 9}
//        Output: Maximum = 9, Minimum = 1