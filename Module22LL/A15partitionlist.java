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

class LL16{
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

    Node partitionquest(Node head,int x){
        Node a = new Node(-1);
        Node b = new Node(-1);
        Node tempA = a;
        Node tempB = b;
        Node temp = head;

        while (temp != null) {
            if (temp.value < x) {
                tempA.next = temp;
                tempA = tempA.next;
            }else{
                tempB.next = temp;
                tempB = tempB.next;
            }
            temp = temp.next;
        }
        tempB .next = null;
        a = a.next;
        b = b.next;
        if (a == null) {
            return b;
        }
        tempA.next = b;
        return a;
    }
}

public class A15partitionlist {
    public static void main(String[] args) {
        LL16 list = new LL16();

        list.insert(2);
        list.insert(5);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(1);

        System.out.println("Original List:");
        list.display();

        int pivot = 3;
        list.head = list.partitionquest(list.head, pivot);

        System.out.println("Partitioned List around pivot " + pivot + ":");
        list.display();
    } 
}
