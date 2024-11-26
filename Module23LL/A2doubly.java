package Module23LL;

class dNode{
    int value;
    dNode next;
    dNode prev;
    
    dNode(int value){
        this.value = value;
    }
}

public class A2doubly {

    public static void print(dNode head){
        dNode temp = head;
        while (temp != null) {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printrev(dNode tail) {
        dNode temp = tail;
        while (temp != null) {   
            System.out.print(temp.value + " ");
            temp = temp.prev;    
        System.out.println();
    }
    

    public static void main(String[] args) {
        dNode a = new dNode(10);
        dNode b = new dNode(20);
        dNode c = new dNode(30);
        dNode d = new dNode(40);

        a.next = b ; b.prev = a;
        b.next = c ; c.prev = b;
        c.next = d ; d.prev = c;

        print(a);
        printrev(d);
    }
}
