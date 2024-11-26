package Module31heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class A2maxheap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(2);
        pq.add(4);
        pq.add(5);
        System.out.println(pq);
        pq.add(9);
        pq.add(6);
        pq.remove();
        System.out.println(pq+" "+pq.peek());
    }
}