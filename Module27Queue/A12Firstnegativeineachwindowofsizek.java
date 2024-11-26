package Module27Queue;

import java.util.LinkedList;
import java.util.Queue;

public class A12Firstnegativeineachwindowofsizek {

    public long[] printfirstnegtiveint(long A[] , int N , int K){
        Queue <Integer> q = new LinkedList<>();
        long[] res = new long[N-K+1];
        for(int i = 0; i<N; i++){
            if (A[i]<0) {
                q.add(i);
            }
        }
        for(int i=0; i<N-K+1; i++){
            if (q.size() != 0 && q.peek() < i ) {
                q.remove();
            }
            if (q.size() != 0 && q.peek() <= i+K-1) {
                res[i] = A[q.peek()];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        long[] arr = {12, -1, -7, 8, 15, 30, -5, -2};
        int K = 3; 
        int N = arr.length;

        A12Firstnegativeineachwindowofsizek obj = new A12Firstnegativeineachwindowofsizek();
    
        long[] result = obj.printfirstnegtiveint(arr, N, K);
    
        System.out.print("First negative numbers in each window: ");
        for (long num : result) {
            System.out.print(num + " ");
        }
    }
}    