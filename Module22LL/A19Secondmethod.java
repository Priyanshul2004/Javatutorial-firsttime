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

class LL18 {
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

    Node reverselst(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node a = head.next;
        Node newhead = reverselst(a);
        a.next = head;
        head.next = null;

        return newhead;
    }
}

public class A19Secondmethod {
    public static void main(String[] args) {
        LL18 list = new LL18();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Orignal list");
        list.display();

        System.out.println("Answered list ");
        list.head = list.reverselst(list.head);
        list.display();
    }
}