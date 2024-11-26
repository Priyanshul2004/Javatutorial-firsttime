package Module28Tree;
class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}
public class A8levelofbt {
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

        System.out.println(leveloftree(a));
        int heigt = leveloftree(a)-1;
        System.out.println("height of tree = "+heigt);
    }

    public static int leveloftree(Node root){
        if (root == null) {
            return 0;
        }
        int level = 1+Math.max(leveloftree(root.left),leveloftree(root.right));
        return level;
    }
}
