package Module31heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class A4second {
    public static void main(String[] args) {
        int[] arr = {10,2,8,3,7,3,-2,3,-1};
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            pq.add(ele);
            if (pq.size()>k) {
                pq.remove();
            }
        }
        System.out.println(pq.peek());
    }
}
