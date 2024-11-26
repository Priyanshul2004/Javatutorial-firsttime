package Module31heap;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class A7kclosestpointstoorigin {
    public static void main(String[] args) {
        int[][] points = {{1, 3}, {-2, 2}, {5, 8}, {0, 1}};
        int k = 2;

        int[][] closestPoints = kclosest(points, k);

        System.out.println("The " + k + " closest points to the origin are:");
        for (int[] point : closestPoints) {
            System.out.println("(" + point[0] + ", " + point[1] + ")");
        }
    }

    public static class pairs {
        int x;
        int y;

        pairs(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int[][] kclosest(int[][] points, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, pairs> map = new HashMap<>();

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0], y = points[i][1];
            int d2 = x * x + y * y;
            pq.add(d2);
            map.put(d2, new pairs(x, y));
            if (pq.size() > k) {
                pq.remove();
            }
        }

        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            int dist = pq.remove();
            pairs pt = map.get(dist);
            ans[i][0] = pt.x;
            ans[i][1] = pt.y;
        }
        return ans;
    }
}
