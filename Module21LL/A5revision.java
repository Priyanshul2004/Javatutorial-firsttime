package Module21LL;

class Node{
    int value ;
    Node next ;

    public Node(){

    }

    public Node(int value){
        this.value = value;
        this.next = null;
    }
}



public class A5revision {
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node temp = a;
        for (int i = 0; i < 5; i++) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
