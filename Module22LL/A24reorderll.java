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

class LL23 {
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
 

    Node reverse(Node head) {
        Node current = head;
        Node previous = null;
        Node NextNode = null;

        while (current != null) {
            NextNode = current.next;
            current.next = previous;
            previous = current;
            current = NextNode;
        }
        return previous;
    }

    Node middlenode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void reorderList(Node head) {
        Node leftmid = middlenode(head);
        Node head2 = leftmid.next;
        leftmid.next = null;

        head2 = reverse(head2);

        Node dummy = new Node(-1);
        Node temp = dummy;

        while (head != null && head2 != null) {
            temp.next = head;
            head = head.next;
            temp = temp.next;
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        if (head != null) {
            temp.next = head;
        }
        if (head2 != null) {
            temp.next = head2;
        }

        this.head = dummy.next;
    }
}

public class A24reorderll {
    public static void main(String[] args) {
        LL23 list = new LL23();

        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);

        System.out.println("Original List:");
        list.display();

        list.reorderList(list.head);

        System.out.println("Reordered List:");
        list.display();
    }
}