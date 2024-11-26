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

class LL25 {
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

    int lengthoflist(Node head) {
        int n = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        return n;
    }

    Node[] splicttopat(Node head, int k) {
        int n = lengthoflist(head);
        int size = n / k;
        int extra = n % k;
        int idx = 0;
        Node[] arr = new Node[k];
        Node temp = head;
    
        int len = 1;
        Node start = head; 

        while (temp != null) {
            int s = size;
            if (extra > 0) {
                s++;
                extra--;
            }

            if (len == 1) {
                arr[idx++] = start; 
            }

            if (len == s) {
                Node a = temp.next; 
                temp.next = null; 
                start = a; 
                temp = a; 
                len = 1; 
            } else {
                len++;
                temp = temp.next;
            }
        }
        return arr;
    }
}

public class A26splitll {
    public static void main(String[] args) {
        LL25 list = new LL25();
        
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);

        System.out.print("Original List: ");
        list.display();
        
        int k = 3;

        Node[] splitLists = list.splicttopat(list.head, k);

        System.out.println("Split Lists:");
        for (int i = 0; i < splitLists.length; i++) {
            System.out.print("Part " + (i + 1) + ": ");
            Node temp = splitLists[i];
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}