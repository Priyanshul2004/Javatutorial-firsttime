package Module27Queue;

import java.util.LinkedList;
import java.util.Queue;

public class A15dota2senate {

    public String predictpartyvictory(String senate){
        Queue <Integer> r = new LinkedList<>();
        Queue <Integer> d = new LinkedList<>();

        int n = senate.length();

        for(int i=0; i<n; i++){
            if (senate.charAt(i) == 'R') {
                r.add(i);
            }else{
                d.add(i);
            }
        }
        while (!r.isEmpty() && !d.isEmpty()) {
            if (r.peek() < d.peek()) {
                r.add(n++);
            }else{
                d.add(n++);
            }
            r.poll();
            d.poll();
        }
        return r.isEmpty() ? "Dire" : "radient" ;
    }
    public static void main(String[] args) {

        String senate = "RDDRRD";
        A15dota2senate obj = new A15dota2senate();
        String result = obj.predictpartyvictory(senate);
        System.out.println("The winning party is: " + result);
    }
}