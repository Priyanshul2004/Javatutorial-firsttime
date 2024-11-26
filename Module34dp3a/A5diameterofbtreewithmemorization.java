package Module34dp3a;
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
public class A5diameterofbtreewithmemorization {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("Diameter of the binary tree: " + diameterbt(root));
    }
    public static int levels(Node root){
        if (root == null) {
            return 0;
        }
        int leftlevel = levels(root.left);
        int rightlevel = levels(root.right);
        return 1+Math.max(leftlevel, rightlevel);
    }
    public static int diameterbt(Node root){
        if (root==null) {
            return 0;
        }
        int mydia =  levels(root.left)+levels(root.right);
        int leftdia = diameterbt(root.left);
        int rightdia = diameterbt(root.right);
        return Math.max(mydia, Math.max(leftdia, rightdia));
    }
}
// use first solution for this