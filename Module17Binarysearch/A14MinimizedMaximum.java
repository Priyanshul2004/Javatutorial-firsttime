package Module17Binarysearch;

public class A14MinimizedMaximum {

    public static boolean ispossible(int maxQ, int n, int[] arr) {
        int stores = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % maxQ == 0) {
                stores += arr[i] / maxQ;
            } else {
                stores += arr[i] / maxQ + 1;
            }
        }
        System.out.println("Stores needed for maxQ " + maxQ + ": " + stores);
        return stores <= n;
    }

    public static void main(String[] args) {
        int[] arr = { 15, 10, 10 };
        int m = arr.length;
        int mx = 0;
        for (int i = 0; i < m; i++) {
            mx = Math.max(mx, arr[i]);
        }

        int low = 1;
        int hi = mx;
        int n = 7;
        int ans = 0;

        while (low <= hi) {
            int mid = low + (hi - low) / 2;
            if (ispossible(mid, n, arr)) {
                ans = mid;
                System.out.println("Current minimized maximum: " + ans);
                hi = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("The final minimized maximum quantity per store is: " + ans);
    }
}

// koko eating bananas 
// min time to complete trips 
