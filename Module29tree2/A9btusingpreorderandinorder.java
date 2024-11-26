package Module29tree2;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class A9btusingpreorderandinorder {
    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        
        Node root = builttree(preorder, inorder);
        System.out.println("Tree constructed successfully.");

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

    public static Node builttree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder, inorder, 0, n - 1, 0, n - 1);
    }
}

