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
public class A8pathsum2 {
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

        ArrayList<ArrayList<Integer>> result = pathsum(a, 10);
        System.out.println("Paths summing to target:");
        System.out.println(result);
    }

    public static ArrayList <Integer> copy(ArrayList<Integer> arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele : arr){
            list.add(ele);
        }
        return list;
    }
    public static void helper(Node root, int target, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (root.val == target) {
                arr.add(root.val);
                ans.add(new ArrayList<>(arr));
            }
            return;
        }
        arr.add(root.val);
        ArrayList<Integer> arr1 = copy(arr);
        ArrayList<Integer> arr2 = copy(arr);
        helper(root.left, target - root.val, arr1, ans);
        helper(root.right, target - root.val, arr2, ans);
    }

    public static ArrayList<ArrayList<Integer>> pathsum(Node root, int targetsum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        helper(root, targetsum, arr, ans);
        return ans;
    }
}