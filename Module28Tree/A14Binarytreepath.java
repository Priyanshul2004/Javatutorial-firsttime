package Module28Tree;

import java.util.ArrayList;
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}
public class A14Binarytreepath {

    public static void path(Node root,String s,ArrayList<String> ans){
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            s += root.val;
            ans.add(s);
            return;
        }
        path(root.left, s+root.val+" -> ", ans);
        path(root.right, s+root.val+" -> ", ans);
    }

    public static ArrayList<String> binarytreepath(Node root){
        ArrayList <String> ans = new ArrayList<>();
        path(root,"",ans);
        return ans;
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

        ArrayList<String> result = binarytreepath(a);

        System.out.println("Paths in the binary tree:");
        for (String path : result) {
            System.out.println(path);
        }
    }
}