package Module17Binarysearch;

public class A4Firstandlastopsition {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8, 9 };

        int n = arr.length;

        int target = 5;
        int low = 0;
        int high = n - 1;

        boolean flag = false;
        while (low <= high) {
            int mid = ((low + high) / 2);
            if (arr[mid] == target) {
                flag = true;
                break;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            }
        }
        if (flag == false) {
            System.out.println("Number not exist");
        }

        low = 0;
        high = n - 1;
        int fb = n;

        while (low <= high) {
            int mid = ((low + high) / 2);
            if (arr[mid] >= target) {
                fb = Math.min(fb,mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("First position is : " + fb);

        low = 0;
        high = n - 1;
        int lp = n;

        while (low <= high) {
            int mid = ((low + high) / 2);
            if (arr[mid] > target) {
                lp = Math.min(lp,mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Last position is :" + (lp-1));
    }
}
