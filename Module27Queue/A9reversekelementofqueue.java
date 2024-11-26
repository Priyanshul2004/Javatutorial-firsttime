package Module27Queue;
import java.util.*;
import java.util.Queue;
import java.util.Stack;

public class A9reversekelementofqueue {

    public Queue<Integer> modifyque(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        int n = q.size() - k;  

        while (k-- > 0) {
            int a = q.peek();
            q.poll();
            st.push(a);
        }

        while (!st.isEmpty()) {
            int a = st.peek();
            st.pop();
            q.add(a);
        }

        for (int i = 0; i < n; i++) {
            int a = q.peek();
            q.poll();
            q.add(a);
        }

        return q;
    }

    public static void main(String[] args) {
        A9reversekelementofqueue obj = new A9reversekelementofqueue();
        
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        int k = 3;

        Queue<Integer> modifiedQueue = obj.modifyque(q, k);

        for (int val : modifiedQueue) {
            System.out.print(val + " ");
        }
    }
}
