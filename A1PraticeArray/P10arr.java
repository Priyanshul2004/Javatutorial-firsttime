package A1Pratice;

public class P10arr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();

        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            n--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
// Input: arr = {1, 2, 3, 4}
// Output: Reversed array = {4, 3, 2, 1}