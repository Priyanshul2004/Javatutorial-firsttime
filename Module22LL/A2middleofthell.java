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

class LL4 {
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

    void length() {
        Node temp = head;
        int length = 0;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        System.out.println(length);
    }

    Node midnode(Node head) {
        Node temp = head;
        int length = 0;

        while (temp != null) {
            temp = temp.next;
            length++;
        }

        int mid = length / 2 + 1;
        temp = head;

        for (int i = 0; i < mid - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }
}

public class A2middleofthell {
    public static void main(String[] args) {
        LL4 list = new LL4();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(8);

        System.out.println("Orignal list");
        list.display();

        System.out.println("length od ll");
        list.length();

        System.out.println("Mid node is ");
        Node head1 = list.head;
        Node middlenode = list.midnode(head1);
        System.out.println(middlenode.value);
    }
}