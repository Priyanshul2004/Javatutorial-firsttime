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

class LL10 {
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

    Node cycleinll(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                break;
            }
        }

        if (fast != slow) {
            return null;
        }

        Node temp = head;
        while (temp != slow) {
            slow = slow.next;
            temp = temp.next;
        }

        return slow;
    }

}

public class A9cycleinll {
    public static void main(String[] args) {

        LL10 list = new LL10();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(5);
        list.insert(5);

        list.head.next.next.next.next = list.head.next;

        Node cycleNode = list.cycleinll(list.head);

        if (cycleNode != null) {
            System.out.println("Cycle detected at node with value: " + cycleNode.value);
        } else {
            System.out.println("No cycle detected");
        }
    }
}