package Module27Queue;

import java.util.LinkedList;
import java.util.Queue;

public class A4removeelementatevenidexinaque {
    static Queue <Integer> que;
    static Queue <Integer> newque;

    public static void removeEven(){
        newque = new LinkedList<>();

        while (!que.isEmpty()) {
            que.remove();
            if (!que.isEmpty()) {
                newque.add(que.remove());
            }
        }
        que = newque;
    }

    public static void print(){
       System.out.println(que);
    }
    public static void main(String[] args) {
       que = new LinkedList<>();
       que.add(1);
       que.add(2);
       que.add(3);
       que.add(4);
       que.add(5);
       que.add(6);

       removeEven();
       System.out.println(que);
    }
}
