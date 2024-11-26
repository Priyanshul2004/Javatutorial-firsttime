package Module24stack;

public class A9LLreprentationofstack {

    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static class  Stack {
        Node head = null;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int size(){
            return size;
        }

        int pop(){
            if (head == null) {
                System.out.println("stack is empty");
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek(){
            if (head == null) {
                System.out.println("stack is empty");
                return -1;
            }
            int x = head.val;
            return x;
        }

        boolean isEmpty(){
            if (size == 0) {
                return true;
            }else return false;
        }

        void display(){
            displayrec(head);
        }

        void displayrec(Node h) {
            if (h == null) {
                return; 
            }
            displayrec(h.next);
            System.out.print(h.val); 
        }
        
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st.size());
        System.out.println(st.isEmpty());
        st.display();

        System.out.println(st.peek());
    }
}
