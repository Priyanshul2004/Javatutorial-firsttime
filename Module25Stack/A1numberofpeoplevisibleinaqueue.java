package Module25Stack;

import java.util.Stack;

public class A1numberofpeoplevisibleinaqueue {

    public static int[] canseepersonscount(int[] heights) {
        int n = heights.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] <= heights[i]) {
                res[st.peek()]++;
                st.pop();
            }
            if (!st.isEmpty()) {
                res[st.peek()]++;
            }
            st.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] heights = { 10, 6, 8, 5, 11, 9 };

        int[] result = canseepersonscount(heights);

        System.out.println("Number of people each person can see:");
        for (int count : result) {
            System.out.print(count + " ");
        }
    }
}