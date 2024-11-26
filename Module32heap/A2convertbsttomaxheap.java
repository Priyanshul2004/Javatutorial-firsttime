package Module32heap;
import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class A2convertbsttomaxheap {
        static ArrayList<Integer> values = new ArrayList<>();
        static int index = 0;
        public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        convertToMaxHeap(root);
        printPreorder(root);
    }
    public static void inorderTraversal(Node root) {
        if (root == null) return;
        inorderTraversal(root.left);
        values.add(root.data);
        inorderTraversal(root.right);
    }

    public static void preorderFill(Node root) {
        if (root == null) return;
        root.data = values.get(index++);
        preorderFill(root.left);
        preorderFill(root.right);
    }

    public static void convertToMaxHeap(Node root) {
        values.clear();
        index = 0;
        inorderTraversal(root);
        preorderFill(root);
    }

    public static void printPreorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }
}
