package Module24stack;

import java.util.Stack;

public class A7reverseastackrecursively {

    public static void displayreverse(Stack <Integer> st){
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        System.out.println(top);
        displayreverse(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(5);
        st.push(8);
        st.push(9);
        System.out.println(st);

        displayreverse(st);
    }
}
