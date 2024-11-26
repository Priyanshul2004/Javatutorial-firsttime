package Module31heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class A10topkfrequentelement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 4};
        int k = 2;
        A10topkfrequentelement obj = new A10topkfrequentelement();
        int[] result = obj.topkfeqele(arr, k);
        for (int ele : result) {
            System.out.print(ele + " ");
        }
    }

    public static class pair implements Comparable<pair> {
        int ele;
        int feq;

        pair(int ele, int feq) {
            this.ele = ele;
            this.feq = feq;
        }

        @Override
        public int compareTo(pair p) {
            return this.feq - p.feq;
        }
    }

    public int[] topkfeqele(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            if (map.containsKey(ele)) {
                int feq = map.get(ele);
                map.put(ele, feq);
            } else {
                map.put(ele, 1);
            }
        }
        PriorityQueue<pair> pq = new PriorityQueue<>();
        for (int ele : map.keySet()) {
            int feq = map.get(ele);
            pq.add(new pair(ele, feq));
            if (pq.size() > k) {
                pq.remove();
            }
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            pair p = pq.remove();
            ans[i] = p.ele;
        }
        return ans;
    }
}