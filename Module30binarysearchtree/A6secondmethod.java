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
public class A6secondmethod {
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

        System.out.println(isvalid(a));
    }
    public static void inorder(Node root,ArrayList<Integer>arr){
        if (root == null) {
            return;
        }
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
    public static boolean isvalid(Node root){
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        for(int i=1;i<arr.size();i++){
            if (arr.get(i)<= arr.get(i-1)) {
                return false;
            }
        }
        return true;
    }
}
