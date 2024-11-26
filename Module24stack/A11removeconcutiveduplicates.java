package Module24stack;

import java.util.Stack;

public class A11removeconcutiveduplicates {
    
    public static String removeduplicates(String s){
        Stack <Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if (!st.isEmpty() && st.peek() == c) {
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String input = "abbaca"; 
        String result = removeduplicates(input);
        System.out.println("String after removing consecutive duplicates: " + result);
    }
}