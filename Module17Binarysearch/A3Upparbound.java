package Module17Binarysearch;

public class A3Upparbound {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int n = arr.length;
        int target = 5;
        int ub = n;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = ((low + high) / 2);
            if (arr[mid] > target) {
                ub = Math.min(ub, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(ub);
    }
}