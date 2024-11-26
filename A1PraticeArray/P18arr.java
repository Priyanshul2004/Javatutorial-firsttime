package A1Pratice;

public class P18arr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        System.out.println("total ele which is grater than x is = "+count);
    }
}
