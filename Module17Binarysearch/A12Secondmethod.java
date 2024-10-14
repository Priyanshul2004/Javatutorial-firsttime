package Module17Binarysearch;

public class A12Secondmethod {
    public static void main(String[] args) {
        int[] arr = {44, 22, 33, 11, 1};
        int threshold = 7;
        int n = arr.length;

        int mx = Integer.MIN_VALUE;
        for (int i = 0; i <= n - 1; i++) {
            mx = Math.max(mx, arr[i]);
        }

        int d = 1;
        int result = -1;
        while (d <= mx) {
            int sum = 0;
            int mid = (d + mx) / 2;

            for (int i = 0; i < n; i++) {
                if (arr[i] % mid == 0) {
                    sum += arr[i] / mid;
                } else {
                    sum += (arr[i] / mid) + 1;
                }
            }

            if (sum <= threshold) {
                result = mid;
                mx = mid - 1;
            } else {
                d = mid + 1;
            }
        }
        
        System.out.println(result);
    }
}