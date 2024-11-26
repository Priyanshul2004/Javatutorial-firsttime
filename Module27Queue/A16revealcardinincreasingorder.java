package Module27Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class A16revealcardinincreasingorder {

    public int[] deckreveledincr(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.add(i);
        }
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[q.poll()] = deck[i];
            if (!q.isEmpty()) { // Rotate only if the queue is not empty
                q.add(q.poll());
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] deck = {17, 13, 11, 2, 3, 5, 7};

        A16revealcardinincreasingorder obj = new A16revealcardinincreasingorder();

        int[] result = obj.deckreveledincr(deck);

        System.out.println("The deck in the revealed increasing order is:");
        for (int card : result) {
            System.out.print(card + " ");
        }
    }
}
