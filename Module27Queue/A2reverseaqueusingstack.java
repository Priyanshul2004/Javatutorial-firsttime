package Module27Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class A2reverseaqueusingstack {
    static Queue<Integer> que;

    public static void print() {
        System.out.println(que);
    }

    public static void reverseque() {
        Stack<Integer> st = new Stack<>(); 

        while (!que.isEmpty()) {
            st.push(que.remove());
        }

        while (!st.isEmpty()) {
            que.add(st.pop());
        }
    }

    public static void main(String[] args) {
        que = new LinkedList<>(); 
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        que.add(6);

        System.out.println("Original Queue:");
        print();

        System.out.println("Reversed Queue:");
        reverseque();
        print();
    }
}

