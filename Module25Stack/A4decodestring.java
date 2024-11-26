package Module25Stack;

import java.util.Stack;
import java.util.*;

public class A4decodestring {

    public static String decodestring(String s){
        Stack <Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if (ch != ']') {
                st.push(ch);
            }else{
                StringBuilder sb = new StringBuilder();
                while (st.peek() != '[') {
                    sb.append(st.pop());
                }
                st.pop();
                int k = 0;
                int base = 1;
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    k = (st.pop() - '0') * base + k;
                }
                while (k-- > 0) {
                    for(int i=sb.length()-1; i>=0; i--){
                        st.push(sb.charAt(i));
                    }
                }
            }
        }
        char[] result = new char[st.size()];
        for(int i=st.size()-1; i>=0; i--){
            result[i] = st.pop();
        }

        return new String(result);
    }

    public static void main(String[] args) {
        System.out.println(decodestring("3[a]2[bc]"));
    }
}
// is question ko other code likh ke krna hai 