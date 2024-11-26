package Module30binarysearchtree;
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}
public class A9second {
    static int sum;
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

        System.out.println(bsttogst(a));
    }

    public static void reverseinorde(Node root){
        if (root == null) {
            return;
        }
        reverseinorde(root.right);
        root.val += sum;
        sum = root.val;
        reverseinorde(root.left);
    }
    public static Node bsttogst(Node root){
        sum = 0;
        reverseinorde(root);
        return root;
    }
}
