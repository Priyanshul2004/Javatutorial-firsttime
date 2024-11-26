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

class LL8 {
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

    Node intersection(Node head1, Node head2) {
        int lengthA = 0;
        Node tempA = head1;
        while (tempA != null) {
            tempA = tempA.next;
            lengthA++;
        }

        int lengthB = 0;
        Node tempB = head2;
        while (tempB != null) {
            tempB = tempB.next;
            lengthB++;
        }

        tempA = head1;
        tempB = head2;

        if (lengthA>lengthB) {
            for(int i=1;i<= lengthA-lengthB;i++){
                tempA = tempA.next;
            }
        }else{
            for(int i=1;i<= lengthB-lengthA;i++){
                tempB = tempB.next;
            }
        }
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}

public class A6intersectionoftwoll {
    public static void main(String[] args) {
        LL8 list1 = new LL8();
        LL8 list2 = new LL8();

        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list1.insert(5);

        System.out.println("first ll");
        list1.display();

        list2.insert(6);
        list2.insert(4);
        list2.insert(5);
       
        
        System.out.println("Second ll");
        list2.display();

        Node intersectionNode = list1.intersection(list1.head, list2.head);
        if (intersectionNode != null) {
            System.out.println("Intersection at node with value: " + intersectionNode.value);
        } else {
            System.out.println("No intersection found.");
        }
    }
}

// question me sirf method likh ke dekhna hai