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

public class A8bsttogreatestsumtree {
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

        System.out.println(nsttogst(a));
        inorderPrint(a); 
    }


    public static void inorderPrint(Node root) {
        if (root == null) {
            return;
        }
        inorderPrint(root.left);
        System.out.print(root.val + " ");
        inorderPrint(root.right);
    }

    public static void inorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }

    public static Node nsttogst(Node root) {
        ArrayList<Integer> arr = new ArrayList<>(); 

        int n = arr.size();
        for (int i = n - 2; i >= 0; i--) {
            arr.set(i, arr.get(i) + arr.get(i + 1));
        }

        updateTreeWithValues(root, arr, new int[]{0});
        return root;
    }

    public static void updateTreeWithValues(Node root, ArrayList<Integer> arr, int[] index) {
        if (root == null) {
            return;
        }
        updateTreeWithValues(root.left, arr, index);
        root.val = arr.get(index[0]);
        index[0]++;
        updateTreeWithValues(root.right, arr, index);
    }
}




// package Module30binarysearchtree;

// import java.util.ArrayList;

// class Node {
//     int val;
//     Node left;
//     Node right;

//     Node(int val) {
//         this.val = val;
//     }
// }
// public class A8bsttogreatestsumtree {
//     public static void main(String[] args) {
//         Node a = new Node(50);
//         Node b = new Node(30);
//         Node c = new Node(70);
//         Node d = new Node(20);
//         Node e = new Node(40);
//         Node f = new Node(60);
//         Node g = new Node(80);

//         a.left = b;
//         a.right = c;
//         b.left = d;
//         b.right = e;
//         c.left = f;
//         c.right = g;

//         System.out.println(nsttogst(a));
//     }
//     public static void inorder(Node root,ArrayList<Integer>arr){
//         if (root == null) {
//             return;
//         }
//         inorder(root.left, arr);
//         arr.add(root.val);
//         inorder(root.right, arr);
//     }
//     public static Node nsttogst(Node root){
//         ArrayList<Node> arr = new ArrayList<>();
//         inorder(root, null);
//         int n = arr.size();
//         for(int i=n-2;i>=0;i--){
//             arr.get(i).val += arr.get(i+1).val;
//         }
//         return root;
//     }
// }