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

class LL24 {
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

    Node addtwonum(Node l1,Node l2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int value1 = 0;
            int value2 = 0;
            if (l1 != null) {
                value1 = l1.value;
            }
            if (l2 != null) {
                value2 = l2.value;
            }
            int num = value1+value2+carry;
            Node node = new Node(num%10);
            temp.next = node;
            temp = temp.next;
            if (num>9) {
                carry = 1;
            }else{
                carry = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if (carry == 1) {
            Node node = new Node(1);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }
}
public class A25addtonum {
    public static void main(String[] args) {
        LL24 list1 = new LL24();
        list1.insert(3);
        list1.insert(4);
        list1.insert(2);  

        LL24 list2 = new LL24();
        list2.insert(4);
        list2.insert(6);
        list2.insert(5);  

        System.out.println("First Number:");
        list1.display();

        System.out.println("Second Number:");
        list2.display();

        LL24 result = new LL24();
        result.head = result.addtwonum(list1.head, list2.head);

        System.out.println("Sum:");
        result.display();
    }
}