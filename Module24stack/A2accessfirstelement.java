package Module24stack;

import java.util.Stack;

public class A2accessfirstelement {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(5);
        st.push(8);
        st.push(9);

        System.out.println(st.isEmpty());

        while (st.size() > 1) {
            st.pop();
        }
        System.out.println(st.peek());
    }
}
