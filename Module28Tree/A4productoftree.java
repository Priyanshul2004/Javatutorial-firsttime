package Module28Tree;
class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}
public class A4productoftree {
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

        System.out.println(product(a));
    }

    public static int product(Node root){
        if (root == null) {
            return 1;
        }
        if (root.val == 0) {
            return 0; 
        }
        int produ = root.val * product(root.left) * product(root.right);
        return produ;
    }
}
