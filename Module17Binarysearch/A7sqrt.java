package Module17Binarysearch;

public class A7sqrt {
    public static void main(String[] args) {
        int x = 41;
        int low = 0;
        int high = x;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (mid * mid == x) {
                System.out.println(mid);
                return;
            }

            else if (mid * mid > x) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        // If exact square root isn't found, print the closest integer part (high)
        System.out.println(high);
    }
}
