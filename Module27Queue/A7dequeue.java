package Module27Queue;

public class A7dequeue {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static class Deque {
        Node front;
        Node rear;
        int size;

        Deque() {
            front = rear = null;
            size = 0;
        }

        boolean isEmpty() {
            return size == 0;
        }

        int size() {
            return size;
        }

        void insertfront(int data) {
            Node newNode = new Node(data);
            if (front == null) {
                rear = front = newNode;
            } else {
                newNode.next = front;
                front.prev = newNode;
                front = newNode;
            }
            size++;
        }

        public void insertRear(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
            } else {
                newNode.prev = rear;
                rear.next = newNode;
                rear = newNode;
            }
            size++;
        }

        public void deletefront() {
            if (size == 0) {
                System.out.println("Underflow condition");
            } else {
                Node temp = front;
                front = front.next;

                if (front == null) {
                    rear = null;
                } else {
                    front.prev = null;
                }
                size--;
            }
        }

        public void deleterear() {
            if (size == 0) {
                System.out.println("Underflow condition");
            } else {
                Node temp = rear;
                rear = rear.prev;

                if (rear == null) {
                    front = null;
                } else {
                    rear.next = null;
                }
                size--;
            }
        }

        public int getfront() {
            if (size == 0) {
                System.out.println("Underflow condition");
                return -1;
            } else {
                return front.data;
            }
        }

        public int getrear() {
            if (size == 0) {
                System.out.println("Underflow condition");
                return -1;
            } else {
                return rear.data;
            }
        }
    }

    public static void main(String[] args) {
        Deque deque = new Deque();
    
        System.out.println("Is deque empty? " + deque.isEmpty());
        System.out.println("Size of deque: " + deque.size());
    
        deque.insertfront(10);
        deque.insertfront(20);
        deque.insertfront(30);
        System.out.println("Front after insertFront operations: " + deque.getfront());
        System.out.println("Rear after insertFront operations: " + deque.getrear());
        System.out.println("Size after insertFront: " + deque.size());
    
        deque.insertRear(40);
        deque.insertRear(50);
        System.out.println("Front after insertRear operations: " + deque.getfront());
        System.out.println("Rear after insertRear operations: " + deque.getrear());
        System.out.println("Size after insertRear: " + deque.size());
    
        deque.deletefront();
        System.out.println("Front after deleteFront: " + deque.getfront());
        System.out.println("Size after deleteFront: " + deque.size());
    
        deque.deleterear();
        System.out.println("Rear after deleteRear: " + deque.getrear());
        System.out.println("Size after deleteRear: " + deque.size());
    
        System.out.println("Front element: " + deque.getfront());
        System.out.println("Rear element: " + deque.getrear());
    
        System.out.println("Is deque empty? " + deque.isEmpty());
    
        deque.deletefront();
        deque.deletefront();
        deque.deletefront();
        deque.deletefront();
        System.out.println("Is deque empty after all deletions? " + deque.isEmpty());
        System.out.println("Front element: " + deque.getfront());
        System.out.println("Rear element: " + deque.getrear());
    }
}    