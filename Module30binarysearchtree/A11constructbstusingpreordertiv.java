package Module30binarysearchtree;

import java.util.Arrays;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}
public class A11constructbstusingpreordertiv {
    public static void main(String[] args) {
        int[] preorder = {8, 5, 1, 7, 10, 12};

        Node root = bstfrompreorder(preorder);

        System.out.println("In-order traversal of constructed BST:");
        inorderTraversal(root);
    }
    public static Node helper(int[] preorder, int[] inorder, int prelo, int prehi, int inlo, int inhi) {
       
        if (prelo > prehi || inlo > inhi) {
            return null;
        }
        Node root = new Node(preorder[prelo]);

        int rootIndexInInorder = -1;
        for (int i = inlo; i <= inhi; i++) {
            if (inorder[i] == root.val) {
                rootIndexInInorder = i;
                break;
            }
        }
    
        int leftsize = rootIndexInInorder - inlo;
        root.left = helper(preorder, inorder, prelo + 1, prelo + leftsize, inlo, rootIndexInInorder - 1);
        root.right = helper(preorder, inorder, prelo + leftsize + 1, prehi, rootIndexInInorder + 1, inhi);

        return root;
    }
    public static Node bstfrompreorder(int[] preorder){
        int n = preorder.length;
        int[] inorder = Arrays.copyOf(preorder,n);
        Arrays.sort(inorder);
        return helper(preorder, inorder, 0, n-1, 0, n);
    }
    public static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }
}
