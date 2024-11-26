package Module31heap;

import java.util.PriorityQueue;

public class A8second {
    public static void main(String[] args) {
        int[][] points = {{1, 3}, {-2, 2}, {5, 8}, {0, 1}};
        int k = 2;
        int[][] result = kclosest(points, k);
        for (int[] point : result) {
            System.out.println("[" + point[0] + ", " + point[1] + "]");
        }
    }

    public static class Triplet implements Comparable<Triplet> {
        int d;
        int x;
        int y;

        Triplet(int d, int x, int y) {
            this.d = d;
            this.x = x;
            this.y = y;
        }

        public int compareTo(Triplet t) {
            return this.d - t.d;
        }
    }

    public static int[][] kclosest(int[][] points, int k) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>((a, b) -> b.d - a.d);
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0], y = points[i][1];
            int d = x * x + y * y;
            pq.add(new Triplet(d, x, y));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            Triplet t = pq.poll();
            ans[i][0] = t.x;
            ans[i][1] = t.y;
        }
        return ans;
    }
}