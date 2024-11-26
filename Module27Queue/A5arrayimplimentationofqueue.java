package Module27Queue;

public class A5arrayimplimentationofqueue {

    public static class que{
        int f = -1;
        int r = -1;
        int size = 0;

        int[] arr = new int[5];

        public void add(int value){
            if (r == arr.length-1) {
                System.out.println("que is full");
                return;
            }
            if (f == -1 && r == -1) {
                f = 0;
                r = 0;
                arr[r] = value;
            }
            else{
                arr[++r] = value;
            }
            size++;
        }

        public int remove(){
            if (size == 0) {
                System.out.println("que is empty");
                return -1;
            }
            int val = arr[f++];
            size--;
            return val;
        }

        public int peek(){
            if (size == 0) {
                System.out.println("que is empty");
                return -1;
            }
            return arr[f];
        }
    }
    public static void main(String[] args) {
        que q = new que();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
    }
}
