package Module24stack;

import java.util.Stack;

public class A3reverseastack {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(5);
        st.push(8);
        st.push(9);

        System.out.println("Stack "+st);

        Stack <Integer> streverse = new Stack<>();

        while (!st.isEmpty()) {
            int element = st.pop();
            streverse.push(element);
        }

        System.out.println("reversed "+streverse);
    }
}
