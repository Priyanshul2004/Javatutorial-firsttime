package Module24stack;
public class A8arrayimplemetationofstack {
    public static class Stack {
        private int[] arr = new int[5];
        private int idx = 0;
    
        boolean isfull(){
            if (arr.length == idx) {
                return true;
            }else return false;
        }

        void push(int x){
            if (isfull()) {
                System.out.println("stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int pop(){
            if (isempty()) {
                System.out.println("stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        int peek(){
            if (idx == 0) {
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }

        void display(){
            for (int i = 0; i <= idx-1; i++) {
                System.out.print(arr[i]+" ");
            }
        }

        int size(){
            return idx;
        }

        boolean isempty(){
            if (idx == 0) {
                return true;
            }else{
                return false;
            }
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st.peek());
        System.out.println(st.size());
        st.display();
        System.out.println();
        System.out.println(st.isempty());
        System.out.println(st.pop());
        System.out.println(st.size());
    }
}
