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

class LL3 {
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

    // Delete node method, which removes a given node
    void deletenode(Node node) {

        if (node == null || node.next == null) {
            System.out.println("Invalid node for deletion.");
            return;
        }
        node.value = node.next.value;
        node.next = node.next.next;
    }
}

public class A1Deletenodefromll {
    public static void main(String[] args) {
        LL3 list = new LL3();
        list.insert(1);
        list.insert(3);
        list.insert(5);
        list.insert(7);

        System.out.println("Original List:");
        list.display();

        
        Node nodeToDelete = list.head.next;
        list.deletenode(nodeToDelete);

        System.out.println("List after deleting the node:");
        list.display();
    }
}
