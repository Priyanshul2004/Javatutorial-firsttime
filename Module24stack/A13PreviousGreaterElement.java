package Module24stack;

import java.util.Stack;

public class A13PreviousGreaterElement {
    public static void prevGreater(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            
            if (st.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(st.peek() + " ");
            }
            st.push(arr[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5, 3};
        int n = arr.length;
        prevGreater(arr, n);
    }
}