package Module24stack;

import java.util.Stack;

public class A10balancedbracket {

    public static boolean isvalid(String s){
        Stack <Character> st = new Stack<>();

        for(char c: s.toCharArray()){
            if (c == '(') {
                st.push(')');
            }else if (c == '{') {
                st.push('}');
            }else if (c == '[') {
                st.push(']');
            }else if (st.isEmpty() || st.pop() != c) {
                return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String input = "{[()]}"; 
        
        if (isvalid(input)) {
            System.out.println("The brackets are balanced.");
        } else {
            System.out.println("The brackets are not balanced.");
        }
    }
}
