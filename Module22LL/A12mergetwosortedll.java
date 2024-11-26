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

class LL13 {
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

    Node mergetwolist(Node list1, Node list2) {
        Node dummy = new Node(100);
        Node temp = dummy;
        Node temp1 = list1;
        Node temp2 = list2;

        while (temp1 != null && temp2 != null) {
            if (temp1.value <= temp2.value) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;  
        }

        if (temp1 == null) {
            temp.next = temp2;
        } else {
            temp.next = temp1;
        }
        return dummy.next;
    }
}

public class A12mergetwosortedll {
    public static void main(String[] args) {
        LL13 list1 = new LL13();
        LL13 list2 = new LL13();

        list1.insert(9);
        list1.insert(7);
        list1.insert(5);
        list1.insert(3);
        list1.insert(1);

        list2.insert(10);
        list2.insert(8);
        list2.insert(6);
        list2.insert(4);
        list2.insert(2);

        System.out.print("List 1: ");
        list1.display();
        System.out.print("List 2: ");
        list2.display();

        LL13 mergedList = new LL13();
        mergedList.head = mergedList.mergetwolist(list1.head, list2.head);

        System.out.print("Merged List: ");
        mergedList.display();
    }
}