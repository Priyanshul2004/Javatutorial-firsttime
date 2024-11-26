package Module24stack;

import java.util.Stack;

public class A6pusheleinbottamofthestack {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(5);
        st.push(8);
        st.push(9);
        System.out.println(st);

        Stack <Integer> temp = new Stack<>();
        while (!st.isEmpty()) {
            int element = st.pop();
            temp.push(element);
        }

        st.push(1000);

        while (!temp.isEmpty()) {
            int element = temp.pop();
            st.push(element);
        }

        System.out.println(st);
    }
}
