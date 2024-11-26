package Module27Queue;

public class A6llrepresantationofqueue {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class queue {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            if (size == 0) { 
                tail = null;
            }
            return x;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int getSize() {
            return size;
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
  
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Size of queue: " + q.getSize()); 

        System.out.println("Peek: " + q.peek()); 
        System.out.println("Removed: " + q.remove()); 

        System.out.println("Peek after removal: " + q.peek()); 
        System.out.println("Size after removal: " + q.getSize()); 

        System.out.println("Is queue empty? " + q.isEmpty()); 

        q.remove();
        q.remove();

        System.out.println("Is queue empty after removing all elements? " + q.isEmpty()); 
    }
}
