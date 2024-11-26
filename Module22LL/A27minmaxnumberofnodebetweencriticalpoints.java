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

class LL26 {
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

    int[] nodebtweenctpoint(Node head){
        Node left = head;
        Node mid = head.next;
        Node right = head.next.next;
        int first = -1;
        int last = -1;
        int idx = 1;
        int[] arr = {-1,-1};
        int mindistance = Integer.MAX_VALUE;
        while (right != null) {
            if (mid.value < left.value && mid.value < right.value || mid.value > left.value && mid.value > right.value) {
                if (first == -1) {
                    first = idx;
                }
                if (last != -1) {
                    int dist = idx-last;
                    mindistance = Math.min(mindistance, dist);
                }
                last = idx;
            }
            idx++;
            left = left.next;
            mid = mid.next;
            right = right.next;
        }
        if (first == last) {
            return arr;
        }
        int maxdistance = last-first;
        arr[0] = mindistance;
        arr[1] = maxdistance;
        return arr;
    }
}
public class A27minmaxnumberofnodebetweencriticalpoints {
    public static void main(String[] args) {
        LL26 list = new LL26();

        list.insert(5);
        list.insert(3);
        list.insert(8);
        list.insert(1);
        list.insert(6);
        list.insert(9);

        System.out.print("Linked List: ");
        list.display();

        int[] result = list.nodebtweenctpoint(list.head);
        System.out.println("Minimum distance between critical points: " + result[0]);
        System.out.println("Maximum distance between critical points: " + result[1]);
    }
}
