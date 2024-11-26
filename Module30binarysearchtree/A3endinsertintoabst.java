package Module30binarysearchtree;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}
public class A3endinsertintoabst {
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

        System.out.println(insertintobst(a, 200));
    }
    public static void insert(Node root,int val){
        if (val<root.val) {
            if (root.left == null) {
                root.left = new Node(val);
            }else{
                insert(root.left, val);
            }
        }else{
            if (root.right == null) {
                root.right = new Node(val);
            }else{
                insert(root.right, val);
            }
        }
    }
    public static Node insertintobst(Node root,int val){
        if (root == null) {
            return new Node(val);
        }
        insert(root,val);
        return root;
    }
}