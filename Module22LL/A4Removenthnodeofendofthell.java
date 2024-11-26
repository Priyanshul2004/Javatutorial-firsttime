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

class LL6 {
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
        Node temp = head;
        int length = 0;

        while (temp != null) {
            temp = temp.next;
            length++;
        }

        if (length == n) {
            return head.next;
        }

        temp = head;
        // formula => (length-n+1)
        for(int i=1; i<=length-n-1;i++){
            temp = temp.next;

        }
        temp.next = temp.next.next;
        return head;
    }
}

public class A4Removenthnodeofendofthell {
    public static void main(String[] args) {
        LL6 list = new LL6();
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
