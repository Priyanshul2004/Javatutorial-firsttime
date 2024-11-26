package Module29tree2;
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}
public class A7balancedbinarytree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        System.out.println(isbalanced(a));
    }
    public static int level(Node root){
        if (root == null) {
            return 0;
        }
        return 1+Math.max(level(root.left), level(root.right));
    }

    public static boolean isbalanced(Node root){
        if (root == null) {
            return true;
        }
        int diff = Math.abs(level(root.left)-level(root.right));
        if (diff>1) {
            return false;
        }
        return isbalanced(root.left) && isbalanced(root.right);
    }
}