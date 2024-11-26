package Module31heap;

import java.util.PriorityQueue;

public class A3findkthelementinarr {
    public static void main(String[] args) {
        int[] arr = {10,2,8,3,7,3,-2,3,-1};
        int k = 3;
        PriorityQueue<Integer> h = new PriorityQueue<>();
        for(int ele:arr){
            h.add(ele);
        }
        for(int i=1;i<=k-1;i++){
            h.remove();
        }
        System.out.println(h.peek());
    }
}
