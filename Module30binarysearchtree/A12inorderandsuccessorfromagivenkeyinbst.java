package Module30binarysearchtree;

import java.util.ArrayList;
import java.util.List;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class A12inorderandsuccessorfromagivenkeyinbst {
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        int key = 40;

        List<Integer> preorderList = new ArrayList<>();
        preorderTraversal(root, preorderList);

        int[] result = findPredecessorAndSuccessor(preorderList, key);

        System.out.println("Predecessor: " + (result[0] != -1 ? result[0] : "None"));
        System.out.println("Successor: " + (result[1] != -1 ? result[1] : "None"));
    }

    public static void preorderTraversal(Node root, List<Integer> list) {
        if (root == null)
            return;
        list.add(root.val);
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);
    }

    public static int[] findPredecessorAndSuccessor(List<Integer> list, int key) {
        int[] result = { -1, -1 };
        int index = list.indexOf(key);
        if (index != -1) {
            if (index > 0)
                result[0] = list.get(index - 1);
            if (index < list.size() - 1)
                result[1] = list.get(index + 1);
        }
        return result;
    }
}
