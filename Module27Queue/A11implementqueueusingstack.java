package Module27Queue;

import java.util.Stack;

public class A11implementqueueusingstack {

    class myqueue{
        Stack <Integer> input ;
        Stack <Integer> output ;

        public myqueue(){
            input = new Stack<>();
            output = new Stack<>();
        }

        public void push(int x){
            input.push(x);
        }

        public int pop(){
            peek();
            return output.pop();
        }

        public int peek(){
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push((input.pop()));
                }
            }
            return output.peek();
        }

        public boolean empty(){
            return input.empty() && output.empty();
        }
    }
    public static void main(String[] args) {
        A11implementqueueusingstack obj = new A11implementqueueusingstack();
        myqueue queue = obj.new myqueue();
        
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty()); 
        System.out.println(queue.pop());
        System.out.println(queue.empty()); 
    }
}
