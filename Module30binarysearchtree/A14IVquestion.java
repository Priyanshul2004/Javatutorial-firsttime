package Module30binarysearchtree;

import java.util.ArrayList;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class A14IVquestion {
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

        flatten(a);
        printFlattened(a);
    }

    public static void preorder(Node root, ArrayList<Node> pre) {
        if (root == null) {
            return;
        }
        pre.add(root);
        preorder(root.left, pre);
        preorder(root.right, pre);
    }

    public static void flatten(Node root) {
        ArrayList<Node> pre = new ArrayList<>();
        preorder(root, pre);
        int n = pre.size();

        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                pre.get(i).right = pre.get(i + 1);
            }
            pre.get(i).left = null;
        }
    }

    public static void printFlattened(Node root) {
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.right;
        }
    }
}