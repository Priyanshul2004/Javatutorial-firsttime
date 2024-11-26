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

class LL20 {
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

    Boolean ispalindrome(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node j = reverselst(slow);
        Node i = head;

        while (j != null) {
            if (i.value != j.value) {
                return false;
            }
            i = i.next;
            j = j.next;
        }
        return true;
    }
}

public class A21secondmtdusethismethod {
    public static void main(String[] args) {
        LL20 list = new LL20();

        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(1);

        System.out.print("Linked List: ");
        list.display();

        if (list.ispalindrome(list.head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}