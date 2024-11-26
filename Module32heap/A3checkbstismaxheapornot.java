package Module32heap;

class Node {
    int val;
    Node left, right;

    Node(int data) {
        this.val = data;
        left = right = null;
    }
}

public class A3checkbstismaxheapornot {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(6);
        Node e = new Node(4);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;

        System.out.println(ismaxheap(a));
    }
    
    public static boolean ismaxheap(Node root) {
        int n = size(root);
        return isheap(root) && iscbt(root, 0, n);
    }

    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    public static boolean iscbt(Node root, int i, int n) {
        if (root == null) {
            return true;
        }
        if (i >= n) {
            return false;
        }
        return iscbt(root.left, 2 * i + 1, n) && iscbt(root.right, 2 * i + 2, n);
    }

    public static boolean isheap(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.val < root.left.val) {
            return false;
        }
        if (root.right != null && root.val < root.right.val) {
            return false;
        }
        return isheap(root.left) && isheap(root.right);
    }
}