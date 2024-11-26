package Module26Stack3;

import java.util.Stack;

public class A2prefix {
    public static void main(String[] args) {
        String str = "8-(5+3)*(4/6)";
        System.out.println("Infix Expression: " + str);
        
        Stack<String> value = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            
            if (ascii >= 48 && ascii <= 57) {
                String s = String.valueOf(ch); 
                value.push(s);
            } 
            
            else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } 
     
            else if (ch == ')') {
                while (op.peek() != '(') {
                    String v2 = value.pop();
                    String v1 = value.pop();
                    char o = op.pop(); 
                    String t = o + v1 + v2;
                    value.push(t);
                }
                op.pop(); // Pop the '('
            } 

            else {
                if (ch == '+' || ch == '-') {
                    while (!op.isEmpty() && (op.peek() == '+' || op.peek() == '-' || op.peek() == '*' || op.peek() == '/')) {
                        String v2 = value.pop();
                        String v1 = value.pop();
                        char o = op.pop(); // Mistake: Used `0` instead of `o`
                        String t = o + v1 + v2;
                        value.push(t);
                    }
                    op.push(ch);
                } 
                else if (ch == '*' || ch == '/') {
                    while (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) {
                        String v2 = value.pop();
                        String v1 = value.pop();
                        char o = op.pop(); // Mistake: Used `0` instead of `o`
                        String t = o + v1 + v2;
                        value.push(t);
                    }
                    op.push(ch);
                } else {
                    op.push(ch);
                }
            }
        }

        while (value.size() > 1) {
            String v2 = value.pop();
            String v1 = value.pop();
            char o = op.pop(); // Mistake: Used `0` instead of `o`
            String t = o + v1 + v2;
            value.push(t);
        }

        System.out.println("Prefix Expression: " + value.peek());
    }
}

