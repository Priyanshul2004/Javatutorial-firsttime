package Module24stack;

import java.util.Stack;

public class A5displaystack {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(5);
        st.push(8);
        st.push(9);

        System.out.println("orignal stack "+st);

        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
