package Module29tree2;

import java.util.ArrayList;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}
public class A6binarytreerightsideview {
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

        System.out.println(rightside(a));
    }

    public static int level(Node root){
        if (root == null) {
            return 0;
        }
        return 1+Math.max(level(root.left), level(root.right));
    }

    public static void preorder(Node root , int level , ArrayList<Integer> ans){
        if (root == null) {
            return;
        }
        ans.set(level, root.val);
        preorder(root.left, level+1, ans);
        preorder(root.right, level+1, ans);
    }

    public static ArrayList <Integer> rightside(Node root){
        int n = level(root);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(0);
        }
        preorder(root,0,ans);
        return ans;
    }
}
