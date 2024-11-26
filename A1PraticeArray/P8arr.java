package A1Pratice;

public class P8arr {
    public static void main(String[] args) {
        int[] arr = {10, 3, 7, 8, 15};

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0) {
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("even = " + even);
        System.out.println("odd = "+odd);
    }
}
// Input: arr = {10, 3, 7, 8, 15}
// Output: Even numbers = 2, Odd numbers = 3