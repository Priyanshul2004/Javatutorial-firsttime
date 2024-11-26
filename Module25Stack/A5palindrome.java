package Module25Stack;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class A5palindrome {

    public static boolean ispalindrome(ListNode head) {
        Stack<ListNode> reverse = new Stack<>();
        ListNode dummy = head;

        while (dummy != null) {
            reverse.push(dummy);
            dummy = dummy.next;
        }

        while (head != null && !reverse.isEmpty()) {
            if (reverse.pop().val != head.val) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println("Is the linked list a palindrome? " + ispalindrome(head)); 
    }
}