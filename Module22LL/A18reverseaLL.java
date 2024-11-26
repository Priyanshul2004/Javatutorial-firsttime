package Module22LL;
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

class LL17{
    Node head;
    Node tail;

    void insert(int value) {
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
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    Node reverse(Node head){
        Node current = head;
        Node previous = null;
        Node NextNode = null;  // head/null

        while (current != null) {
            NextNode = current.next;
            current.next = previous;
            previous = current;
            current = NextNode;
        }
 
        return previous;
    }
}

public class A18reverseaLL {
    public static void main(String[] args) {
        LL17 list = new LL17();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original List:");
        list.display();

        list.head = list.reverse(list.head);

        System.out.println("Reversed List:");
        list.display();
    }
}