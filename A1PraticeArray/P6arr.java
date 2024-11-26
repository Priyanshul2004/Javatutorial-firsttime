package A1Pratice;

public class P6arr {
    public static void main(String[] args) {
        int[] arr = {2,7,4,8,5,9,3};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 5) {
                System.out.print(i+" ");
            }
        }
    }
}
