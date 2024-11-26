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

class SLL1 {
    Node head;
    Node tail;

    void insertathead(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}

public class A3insertatstart {
    public static void main(String[] args) {
        SLL1 list = new SLL1();
        list.insertathead(2);
        list.insertathead(5);
        list.insertathead(6);
        list.insertathead(9);

        list.display();
    }
}
