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

class LL12 {
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

    Node rotate(Node head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        int n = 0;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        k %= n;
        if (k == 0) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        Node newhead = slow.next;
        slow.next = null;
        fast.next = head;
        return newhead;
    }
}

public class A11Rotatell {
    public static void main(String[] args) {
        LL12 list = new LL12();

        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);

        System.out.println("Original List:");
        list.display();

        int k = 2;

        list.head = list.rotate(list.head, k);

        System.out.println("List after rotation by " + k + " positions:");
        list.display();
    }
}
