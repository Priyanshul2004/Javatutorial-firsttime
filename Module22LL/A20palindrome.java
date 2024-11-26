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

class LL19 {
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

    Boolean ispalindrome(Node head){
        if (head.next== null) {
            return true;
        }
        Node newhead = new Node(head.value);
        Node t1 = head.next;
        Node t2 = newhead;

        while (t1 != null) {
            Node temp = new Node(t1.value);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }
        newhead = reverselst(newhead);
        t1 = head;
        t2 = newhead;
        
        while (t1 != null) {
            if (t1.value != t2.value) {
                return false;
            }
            t2 = t2.next;
            t1 = t1.next;
        }
        return true;
    }
}
public class A20palindrome {
    public static void main(String[] args) {
        LL19 list = new LL19();
        
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