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

class LL5 {
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
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    Node midnode(Node head) {
        Node slow = head;
        Node fast = head;

        while ( fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

public class A3secondmethod {
    public static void main(String[] args) {
        LL5 list = new LL5();
        list.insert(9);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(8);

        System.out.println("Orignal list");
        list.display();

        System.out.println("Mid node is ");
        Node head1 = list.head;

        Node middlenode = list.midnode(head1);
        System.out.println(middlenode.value);
        list.display();
    }
}