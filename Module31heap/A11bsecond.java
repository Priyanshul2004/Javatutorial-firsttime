package Module31heap;

import java.util.PriorityQueue;

public class A11bsecond {
    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(laststoneweight(stones));
    }
    public static int laststoneweight(int[] stones){
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int ele:stones){
            pq.add(ele);
        }
        while (pq.size()>1) {
            int y = pq.remove();
            int x = pq.remove();
            if (y!=x) {
                pq.add(y-x);
            }
        }
        if (pq.size()==0) {
            return 0;
        }else{
            return pq.remove();
        }
    }
}
