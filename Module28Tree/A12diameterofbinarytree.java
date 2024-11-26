package Module28Tree;
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}
public class A12diameterofbinarytree {

    public static int levels(Node root){
        if (root == null) {
            return 0;
        }
        return 1+Math.max(levels(root.left), levels(root.right));
    }

    public static int diameterofbt(Node root){
        if (root == null) {
            return 0;
        }

        int mydia = levels(root.left)+levels(root.right);
        int leftdia = diameterofbt(root.left);
        int rightdia = diameterofbt(root.right);

        return Math.max(mydia,Math.max(leftdia, rightdia));
    }
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

        System.out.println(diameterofbt(a));
    }
}
// formula => 