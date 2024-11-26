package Module21LL;
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

public class A1basic {
    public static void main(String[] args) {
        Node a = new Node(91);
        Node b = new Node(31);
        Node c = new Node(61);
        Node d = new Node(41);
        Node e = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // System.out.println(a.value);
        // System.out.println(a.next.value);
        // System.out.println(a.next.next.value);

        Node temp = a;
        for (int i = 0; i < 5; i++) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
