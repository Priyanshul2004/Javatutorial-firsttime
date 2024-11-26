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

class LL11 {
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

    Node duplicate(Node head){
        
        if (head == null) {
            return head;
        }

        Node a = head;
        Node b = head;

        while (b != null) {
            if (b.value == a.value) {
                b = b.next;
            }else{
                a.next = b;
                a=b;
            }
        }

        a.next = null;
        return head;
    }
}


public class A10Duplicatesfromsortedlist {
    public static void main(String[] args) {
        LL11 list = new LL11();
        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(3);
        list.insert(3);
        list.insert(4);
        list.insert(4);
        list.insert(5);

        System.out.println("Original List:");
        list.display(); 

        list.duplicate(list.head);

        System.out.println("List after removing duplicates:");
        list.display();
    }
}