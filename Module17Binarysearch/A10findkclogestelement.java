package Module17Binarysearch;

import java.util.ArrayList;
import java.util.List;

public class A10findkclogestelement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int k = 3;
        int x = 1;

        if (x < arr[0]) {
            for (int i = 0; i < k; i++) {
                ans.add(i);
            }
            Collection.sort(ans);
        } else {
            for (int i = arr.length - 1; i >= arr.length - k; i--) {
                ans.add(i);
            }
        }
        int lb = n;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                lb = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        int j = lb;
        int i = lb - 1;
        while (k > 0 && i >= 0 && j < n) {
            int di = Math.abs((x - arr[i]));
            int dj = Math.abs((x - arr[j]));

            if (di <= dj) {
                ans.add(arr[i]);
                i--;
            } else {
                ans.add(arr[j]);
                j++;
            }
            k--;
        }
        while(i < 0 && k > 0) {
            int dj = Math.abs((x - arr[j]));
            ans.add(arr[j]);
            j++;
            k--;
        }
        while(i == n && k > 0) {
            ans.add(arr[j]);
            i--;
            k--;
        }
    }
}
