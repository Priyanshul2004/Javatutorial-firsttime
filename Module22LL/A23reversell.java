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

class LL21 {
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

    void reverse(Node head) {
        Node current = head;
        Node previous = null;
        Node NextNode = null; // head/null

        while (current != null) {
            NextNode = current.next;
            current.next = previous;
            previous = current;
            current = NextNode;
        }
    }

    Node reversebetween(Node head, int left, int right) {

        if (head.next == null || left == right) {
            return head;
        }

        Node a = null;
        Node b = null;
        Node c = null;
        Node d = null;

        int pos = 1;
        Node temp = head;

        while (temp != null) {
            if (pos == left - 1) {
                a = temp;
            }
            if (pos == left) {
                b = temp;
            }
            if (pos == right) {
                c = temp;
            }
            if (pos == right + 1) {
                d = temp;
            }
            temp = temp.next;
            pos++;
        }

        if (a != null) {
            a.next = null;
        }
        if (c != null) {
            c.next = null;
        }

        reverse(b);

        if (a!=null) {
            a.next = c;
        }
        b.next = d;

        return head;
    }
}

public class A23reversell {
    public static void main(String[] args) {
        LL21 list = new LL21();
        
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        
        System.out.print("Original Linked List: ");
        list.display();
        
        int left = 2;
        int right = 4;
        
        list.head = list.reversebetween(list.head, left, right);
        
        System.out.print("Modified Linked List (reversed between " + left + " and " + right + "): ");
        list.display();
    }
}