package Module30binarysearchtree;
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}
public class A5validbinarysearchtree {
    public static void main(String[] args) {
        Node a = new Node(50);
        Node b = new Node(30);
        Node c = new Node(70);
        Node d = new Node(20);
        Node e = new Node(40);
        Node f = new Node(60);
        Node g = new Node(80);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        System.out.println(isvalid(a));
    }

    public static long max(Node root){
        if (root == null) {
            return Long.MIN_VALUE;
        }
        long a = root.val, b = max(root.left) , c = max(root.right);
        return Math.max(0, Math.max(b, c));
    }

    public static long min(Node root){
        if (root == null) {
            return Long.MAX_VALUE;
        }
        long a = root.val, b = min(root.left) , c = min(root.right);
        return Math.max(0, Math.max(b, c));
    }

    public static boolean isvalid(Node root){
        if (root == null) {
            return true;
        }
        if (root.val<=max(root.left)) {
            return false;
        }
        if (root.val>=min(root.right)) {
            return false;
        }
        return isvalid(root.left) && isvalid(root.right);
    }
}