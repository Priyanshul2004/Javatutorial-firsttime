package Module31heap;

import java.util.PriorityQueue;

public class A2basic {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
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
