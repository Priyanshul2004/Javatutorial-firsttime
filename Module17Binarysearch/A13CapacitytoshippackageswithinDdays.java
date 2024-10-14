// ye or iske baad ke question ko baad me solve krna hai ya dobara vidio dekhna hai
package Module17Binarysearch;

public class A13CapacitytoshippackageswithinDdays {

    public static boolean ispossible(int c, int[] arr, int d) {
        int n = arr.length;
        int load = 0;
        int days = 1;

        for (int i = 0; i < n; i++) {
            if (load + arr[i] <= c) {
                load += arr[i];
            } else {
                load = arr[i];
                days++;
            }
        }

        if (days > d)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 4, 1, 4 };
        int d = 3;

        int n = arr.length;
        int sum = 0;
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, arr[i]);
            sum += arr[i];
        }

        int low = mx;
        int high = sum;
        int minC = sum;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (ispossible(mid, arr, d)) {
                minC = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Minimum capacity to ship packages within " + d + " days: " + minC);
    }
}
