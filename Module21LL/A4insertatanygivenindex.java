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

class SLL2 {
    Node head;
    Node tail;

    void insermid(int idx , int val){
        if (idx == 0) {
            insertathead(val);
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i=1;i<=idx-1;i++){
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
    }

    void insertathead(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    // for gete ele by idx 
    int getele(int idx){

        // if (idx == size-1) {
        //     return tail.value;
        // }
        // if (idx >= size || idx < 0) {
        //     System.out.println("Invalid idx");
        //     return -1;
        // }

        Node temp = head;
        for(int i=1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.value;
    }

    void set(int idx, int val){
        Node temp = head;
        for(int i=1; i<=idx; i++){
            temp = temp.next;
        }
        temp.value = val;
    }

    void deleatatil(int idx)throws Error{
        if (idx == 0) {
            deletebyhead();
        }
        if (head == null) {
            throw new Error("List is empity");
        }
        if (idx < 0) {
            throw new Error("Invalid index");
        }
        Node temp = head;
        for(int i=1; i<= idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    void deletebyhead() throws Error{
        if (head == null) {
            throw new Error("List is empity");
        }
        head = head.next;
    }


    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}

public class A4insertatanygivenindex {
    public static void main(String[] args) {
        SLL2 list = new SLL2();
        list.insertathead(3);
        list.insertathead(2);
        list.insertathead(5);
        list.insertathead(6);
        list.insertathead(9);
        list.display();
        System.out.println("This is amns ");
        list.insermid(2, 0);
        list.display();
        System.out.println("this is ele = "+list.getele(3));
        list.deletebyhead();
        list.display();
        list.deleatatil(2);
        list.display();
    }
}