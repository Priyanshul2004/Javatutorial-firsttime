package Module30binarysearchtree;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class A1basic {
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

        System.out.println(searchinbst(a, 20)); 
    }

    public static Node searchinbst(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val < val) {
            return searchinbst(root.right, val);
        } else if (root.val > val) {
            return searchinbst(root.left, val);
        } else {
            return root;
        }
    }
}