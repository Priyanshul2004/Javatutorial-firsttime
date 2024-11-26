package Module28Tree;
class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}
public class A7sizeofbinarytree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.left = b; a.right =c;
        b.left = d; b.right = e;
        c.left = f;

        System.out.println(size(a));
    }
    public static int size(Node root){
        if (root == null) {
            return 0;
        }
        return 1+size(root.left)+size(root.right);
    }
}