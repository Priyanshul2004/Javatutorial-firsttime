package Module23LL;

class Node {
    int value;
    Node next;
    Node random; 

    public Node() {
    }

    public Node(int value) {
        this.value = value;
        this.next = null;
        this.random = null; 
    }
}

class LL27 {
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
            System.out.print("Value: " + temp.value);
            if (temp.random != null) {
                System.out.print(", Random points to: " + temp.random.value);
            } else {
                System.out.print(", Random points to: null");
            }
            System.out.println();
            temp = temp.next;
        }
        System.out.println();
    }

    Node deepcopy(Node head){
        Node head2 = new Node(head.value);
        Node t1 = head.next;
        Node t2 = head2;

        while (t1 != null) {
            Node temp = new Node(t1.value);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }
        return head2;
    }

    void connectalternatively(Node head, Node head2){
        Node t1 = head;
        Node t2 = head2;

        while (t1 != null && t2 != null) {
            Node t1Next = t1.next; 
            Node t2Next = t2.next; 

            t1.next = t2;          
            if (t1Next != null) {
                t2.next = t1Next; 
            }
            
            t1 = t1Next;           
            t2 = t2Next;          
        }
    }

    void split(Node head, Node head2){
        Node t1 = head;
        Node t2 = head2;
         
        while (t1 != null) {
            t1.next = t2.next;
            t1 = t1.next;
            if (t1 == null) {
                break;
            }
            t2.next = t1.next;
            t2 = t2.next;
        }
    }

    Node copyrandomlist(Node head){
        if (head == null) {
            return null;
        }
        Node head2 = deepcopy(head);
        connectalternatively(head, head2);

        Node t1 = head;
        Node t2 = head2;
        while (t1 != null) {
            t2 = t1.next;
            if (t1.random != null) {
                t2.random = t1.random.next;
            }
            t1 = t1.next.next;
        }
        split(head, head2);
        return head2;
    }
}

public class A1copylistwithrandompointer {
    public static void main(String[] args) {
        LL27 list = new LL27();
        
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
       
        list.head.random = list.head.next.next; 
        list.head.next.random = list.head;      
        list.head.next.next.random = list.head.next.next.next;
        list.head.next.next.next.random = list.head.next; 

        System.out.println("Original List:");
        list.display();

        Node copiedHead = list.copyrandomlist(list.head);

        System.out.println("Copied List:");
        LL27 copiedList = new LL27();
        copiedList.head = copiedHead;
        copiedList.display();
    }
}