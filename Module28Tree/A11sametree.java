package Module28Tree;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class A11sametree {
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

        Node x = new Node(1);
        Node y = new Node(2);
        Node z = new Node(3);
        Node p = new Node(4);
        Node q = new Node(5);
        Node r = new Node(6);
        Node s = new Node(7);

        x.left = y;
        x.right = z;
        y.left = p;
        y.right = q;
        z.left = r;
        z.right = s;

        System.out.println(issamtree(a,x));
    }

    public static boolean issamtree(Node a,Node x){

        if (a == null && x == null) {
            return true;
        }

        if (a == null && x!= null) {
            return false;
        }

        if (a!= null && x == null) {
            return false;
        }

        if (a.val != x.val) {
            return false;
        }
        if (issamtree(a.left, x.left) == false) {
            return false;
        }
        if (issamtree(a.right, x.right) == false) {
            return false;
        }
        return true;
    }
}

// symmetric tree 