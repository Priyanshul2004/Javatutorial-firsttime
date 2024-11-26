package Module32heap;
class Minheap{
    int[] arr;
    int size; 

    Minheap(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    public void add(int num){
        arr[size++] = num;
        upheapify(size-1);
    }
    public void upheapify(int idx){
        if (idx == 0) {
            return;
        }
        int parent = (idx-1)/2;
        if (arr[idx]<arr[parent]) {
            swap(idx,parent);
            upheapify(parent);
        }
    }
    public void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int size(){
        return size;
    }
    public int peek(){
        if (size == 0) {
            System.out.println("heap is empty");
            return -1;
        }
        return arr[0];
    }
    public int remove(){
        if (size == 0) {
            System.out.println("heap is empty");
            return -1;
        }
        int peek = arr[0];
        swap(0, size-1);
        size--;
        downheapify(0);
        return peek;
    }
    public void downheapify(int i){
        if (i>=size) {
            return;
        }
        int lc = 2*1+1; 
        int rc = 2*i+1;

        int mindx = i;
        if (lc<size && arr[lc]<arr[mindx]) {
            mindx = lc;
        }
        if (rc<size && arr[rc]<arr[mindx]) {
            mindx = rc;
        }
        if (i==mindx) {
            return;
        }
        swap(i, mindx);
        downheapify(mindx);
    }
}
public class A1implementationofheapusingarr {
    public static void main(String[] args) {
        Minheap pq = new Minheap(10);
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(6);
        pq.add(7);

        System.out.println(pq.size());
        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq.size());
        System.out.println(pq.peek());
    }
}
// lc = 2p+1
// rc = 2p+2
// p = c-1/2