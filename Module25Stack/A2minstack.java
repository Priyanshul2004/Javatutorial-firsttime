package Module25Stack;
import java.util.*;

public class A2minstack {

    Stack <Integer> s;
    Stack <Integer> min;

    public A2minstack(){
        s =  new Stack<>();
        min = new Stack<>();
    }

    public void push(int val){
        s.push(val);

        if (min.isEmpty() || min.peek() >= s.peek()) {
            min.push(val);
        }
    }

    public  void pop(){
        if (!s.isEmpty()) {
            int val = s.pop();
            if (min.peek() == val) {
                min.pop();
            }
        }
    }

    public int top(){
        if (!s.isEmpty()) {
            return -1;
        }
        return s.peek();
    }

    public int getmin(){
        if (min.isEmpty()) {
            return -1;
        }
        return min.peek();
    }
    public static void main(String[] args) {
        A2minstack minStack = new A2minstack();

        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);

        System.out.println("Current minimum: " + minStack.getmin());  // Expected: 2

        minStack.pop();
        System.out.println("Current minimum after pop: " + minStack.getmin());  // Expected: 3

        minStack.pop();
        System.out.println("Current minimum after another pop: " + minStack.getmin());  // Expected: 3

        System.out.println("Current top element: " + minStack.top());  // Expected: 3
    
        minStack.pop();
        minStack.pop();
        System.out.println("Current minimum after clearing stack: " + minStack.getmin());  // Expected: -1
    }
}    