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


class LL7 {
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

    Node removenthnode(Node head, int n){
        Node slow = head;
        Node fast = head;

        for(int i=1;i<=n;i++){
            fast = fast.next;
        }

        if (fast == null) {
            return head.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}

public class A5secondmethod {
    public static void main(String[] args) {
        LL7 list = new LL7();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(8);
        list.insert(9);

        System.out.println("Orignal linkedlist");
        list.display();

        System.out.println("Answered output");

        Node head1 = list.head;
        list.removenthnode(head1,2);
        list.display();
    }
}
