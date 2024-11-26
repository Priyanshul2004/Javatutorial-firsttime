package Module25Stack;

import java.util.Stack;

public class A3validstacksequence {

    public static boolean Validstackseq(int[] pushed,int[] popped){
        Stack <Integer> st = new Stack<>();
        int j = 0;

        for( int val : pushed){
            st.push(val);
            while (!st.isEmpty() && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        // Test case 1
        int[] pushed1 = {1, 2, 3, 4, 5};
        int[] popped1 = {4, 5, 3, 2, 1};
        System.out.println("Test case 1: " + Validstackseq(pushed1, popped1));
    }
}    