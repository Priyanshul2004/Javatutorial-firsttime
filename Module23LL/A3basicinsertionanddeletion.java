package Module23LL;
class dNode{
    int value;
    dNode next;
    dNode prev;
    
    dNode(int value){
        this.value = value;
    }
}
class DDl{
    dNode head;
    dNode tail;

    int size;
    void display(){
        dNode temp = head;
        while (temp != null) {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void inserttail(int value){
        dNode temp = new dNode(value);
        if (size == 0) {
            head = tail = temp;
        }else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void insertathead(int value){
        dNode temp = new dNode(value);
        if (size == 0) {
            head = tail = temp;
        }else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertatidx(int idx , int value){
        if (idx == 0) {
            insertathead(value);
            return;
        }
        if (idx == size) {
           inserttail(value);
           return;
        }
        if (idx > size || idx < 0) {
            System.out.println("invalid idx");
            return;
        }
        dNode temp = new dNode(value);
        dNode x = head;
        for (int i = 1; i <= idx-1; i++) {
            x = x.next;
        }
        dNode y = x.next;
        x.next = temp; temp.prev = x;
        y.prev = temp; temp.next = y;
        size++;
    }

    void deleteathead() throws Error{
        if (size == 0) throw new Error("list is empty");
        head = head.next;
        head.prev = null;
        size--;
    }

    void deleteattail() throws Error{
        if (size == 0) throw new Error("list is empty");
        tail = tail.prev;
        tail.next = null;
        size--;
    }
}
public class A3basicinsertionanddeletion {
    public static void main(String[] args) {
        DDl list = new DDl();
        list.display();
        list.inserttail(2);
        list.inserttail(3);
        list.inserttail(4);
        list.display();

        list.insertathead(9);
        list.display();

        list.insertatidx(2, 020);
        list.display(); 

        list.deleteathead();
        list.display();

        list.deleteattail();
        list.display();
    }
}

// same delete krna dekhna hai 