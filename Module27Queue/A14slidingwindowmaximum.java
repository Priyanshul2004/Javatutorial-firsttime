package Module27Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class A14slidingwindowmaximum {

    public int[] maxslidingwindow(int[] nums, int k) {
        if (nums == null || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] res = new int[n - k + 1];
        int resi = 0;

        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }
            q.offer(i);
            if (i >= k - 1) {
                res[resi++] = nums[q.peek()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
       
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        A14slidingwindowmaximum obj = new A14slidingwindowmaximum();

        int[] result = obj.maxslidingwindow(nums, k);

        System.out.println("The maximum values in each sliding window are:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}