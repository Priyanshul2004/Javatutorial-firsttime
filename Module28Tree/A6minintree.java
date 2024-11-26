package Module28Tree;
class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}
public class A6minintree {
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
        
        System.out.println(min(a));
    }
    public static int min(Node root){
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int a = root.val;
        int b = min(root.left);
        int c = min(root.right);

        int minu = Math.min(a,Math.min(b, c));
        return minu;
    }
}
