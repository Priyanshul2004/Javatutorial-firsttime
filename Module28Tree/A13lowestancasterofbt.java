package Module28Tree;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class A13lowestancasterofbt {

    public static boolean exists(Node root , Node node){
        if (node == root) {
            return true;
        }
        if (root == null) {
            return false;
        }
        return exists(root.left, node) || exists(root.right, node);
    }

    public static Node lowercommenancesstor(Node root, Node p, Node q) {
        if (p == root || q == root) {
            return root;
        }
        boolean pliesinlst = exists(root.left, p);
        boolean qliesinlst = exists(root.left, q);
        if (pliesinlst == true && qliesinlst == false) {
            return root;
        }
        if (pliesinlst == false && qliesinlst == false) {
            return lowercommenancesstor(root.right, p, q);
        }else{
            return root;
        }
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

        Node lca = lowercommenancesstor(a, d, g);
        System.out.println("Lowest Common Ancestor of " + d.val + " and " + g.val + " is: " + lca.val);
    }
}