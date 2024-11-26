package A1Pratice;

public class P19arr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4 };

        boolean flage = true;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                flage = false;
            }
        }

        if (flage == true) {
            System.out.println("arr is sorted");
        } else {
            System.out.println("arr is not sorted");
        }
    }
}
