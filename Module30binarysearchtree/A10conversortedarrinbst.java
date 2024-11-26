package Module30binarysearchtree;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class A10conversortedarrinbst {
    public static void main(String[] args) {
        int[] sortedArray = {-10, -3, 0, 5, 9};

        Node root = sortedarrtobst(sortedArray);

        inorderTraversal(root);
    }

    public static Node helper(int[] arr, int lo, int hi) {
        if (lo > hi) {
            return null;
        }

        int mid = (lo + hi) / 2;
        Node root = new Node(arr[mid]);

        root.left = helper(arr, lo, mid - 1);
        root.right = helper(arr, mid + 1, hi);

        return root;
    }
    public static Node sortedarrtobst(int[] nums) {
        int n = nums.length;
        return helper(nums, 0, n - 1);
    }

    public static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }
}
