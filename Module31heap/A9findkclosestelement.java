package Module31heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class A9findkclosestelement {
    public static void main(String[] args) {
        int[] arr = {7, 8, 18, 4, 9, 6};
        int k = 3;
        int x = 8;

        ArrayList<Integer> result = findclosestele(arr, k, x);
        System.out.println("K closest elements: " + result);
    }

    public static class pair implements Comparable<pair> {
        int ele;
        int diff;

        pair(int ele, int diff) {
            this.ele = ele;
            this.diff = diff;
        }

        @Override
        public int compareTo(pair p) {
            if (this.diff == p.diff) {
                return p.ele - this.ele;
            }
            return p.diff - this.diff;
        }
    }

    public static ArrayList<Integer> findclosestele(int[] arr, int k, int x) {
        PriorityQueue<pair> pq = new PriorityQueue<>();

        for (int ele : arr) {
            int diff = Math.abs(x - ele);
            pq.add(new pair(ele, diff));
            if (pq.size() > k) {
                pq.remove();
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ans.add(pq.remove().ele);
        }

        Collections.sort(ans);
        return ans;
    }
}