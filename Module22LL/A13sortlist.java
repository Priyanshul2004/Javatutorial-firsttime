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

class LL14 {
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

    Node sortlist(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node fasthalf = head;
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        Node secondhalf = slow.next;
        slow.next = null;
        
        fasthalf = sortlist(fasthalf);
        secondhalf = sortlist(secondhalf);

        Node ans = mergetwolist(fasthalf, secondhalf);
        return ans;
    }
}

public class A13sortlist {
    public static void main(String[] args) {
        LL14 list = new LL14();

        list.insert(2);
        list.insert(4);
        list.insert(1);
        list.insert(7);
        list.insert(3);
        list.insert(10);

        list.head = list.sortlist(list.head);

        list.display();
    }
}