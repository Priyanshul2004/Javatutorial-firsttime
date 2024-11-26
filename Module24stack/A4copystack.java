package Module24stack;

import java.util.Stack;

public class A4copystack {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(5);
        st.push(8);
        st.push(9);

        System.out.println("orignal stack "+st);

        Stack <Integer> temp = new Stack<>();
        while (!st.isEmpty()) {
            int element = st.pop();
            temp.push(element);
        }

        Stack <Integer> copystack = new Stack<>();
        while (!temp.isEmpty()) {
            int element = temp.pop();
            copystack.push(element);
        }

        System.out.println("copy stack "+copystack);
    }
}
