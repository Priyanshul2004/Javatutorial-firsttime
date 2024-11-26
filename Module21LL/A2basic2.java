package Module21LL;

class Node {
    int value;
    Node next;

    public Node() {
        
    }

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class SLL{
    Node head;
    Node tail;

    // add
    void insertatend(int val){
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
    }

    // output
    void display(){
        Node temp = head;
        while (temp != null) {
           System.out.println(temp.value);
           temp = temp.next;
        }
   }

}

public class A2basic2 {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertatend(2);
        list.insertatend(4);
        list.display();
    }
}
