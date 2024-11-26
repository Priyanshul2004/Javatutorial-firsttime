package A1Pratice;

public class P9arr {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 3};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        
        System.out.println(sum);
    }
}
// Input: arr = {4, 7, 1, 3}
// Output: Sum = 15