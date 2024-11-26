package Module27Queue;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import java.util.*;

public class A13reorderqueue {

    public static ArrayList<Integer> rearrangeQueeue(int N,Queue<Integer> q){
        ArrayList <Integer> al = new ArrayList<>();
        Stack <Integer> st = new Stack<>();
        for(int i=1; i<= N/2; i++){
            st.push(q.remove());
        }
        while (st.size()>0) {
            q.add(st.pop());
        }
        for(int i=1; i<= N/2; i++){
            st.push(q.remove());
        }
        for(int i=1; i<= N/2; i++){
            q.add(st.pop());
            q.add(q.remove());
        }
        while (q.size()>0) {
            st.push(q.remove());
        }
        while (st.size()>0) {
            q.add(st.pop());
        }
        while (!q.isEmpty()) {
            al.add(q.remove());
        }
        return al;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        
        ArrayList<Integer> result = rearrangeQueeue(q.size(), q);
  
        System.out.println("Rearranged Queue: " + result);
    }
}