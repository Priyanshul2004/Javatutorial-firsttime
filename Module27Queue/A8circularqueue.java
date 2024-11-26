package Module27Queue;

public class A8circularqueue {

    public static class que {
        int front = -1;
        int rear = -1;
        int size = 0;

        int[] arr = new int[5];

        public void add(int val) {
            if (size == arr.length) {
                System.out.println("arr is full");
                return;
            } else if (size == 0) {
                front = rear = 0;
                arr[0] = val;
            } else if (rear < arr.length - 1) {
                arr[++rear] = val;
            } else if (rear == arr.length - 1) {
                rear = 0;
                arr[0] = val;
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("que is empty");
                return -1;
            }else{
                int val = arr[front];
                if (front == arr.length-1) {
                    front = 0;
                    return -1;
                }else{
                    front++;
                    size--;
                    return val;
                }
            }
        }

        public int peek(){
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            }else{
                return arr[front];
            }
        }

        public void display(){
            if (size == 0) {
                System.out.println("queue is empty");
                return;
            }else{
                if (front <= rear) {
                    for (int i = 0; i <= rear; i++) {
                        System.out.print(arr[i]+" ");
                    }
                }else{
                    for (int i = front; i < arr.length; i++) {
                        System.out.print(arr[i]+" ");
                    }
                    for (int i = 0; i < rear; i++) {
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println();
                }
            }
        }

        public boolean isempty(){
            if (size == 0) {
                return true;
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        que queue = new que();
    
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.display();
    
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.display();
    
        queue.add(60);
        queue.add(70);
        queue.display();
    
        System.out.println(queue.peek());
        System.out.println(queue.isempty());
    }
}    