package Module30binarysearchtree;
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}
public class A13deletionnodeinbst {
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

        System.out.println(deletenode(a, 30));
    }

    public static Node iop(Node root){
        Node temp = root.left;
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp;
    }

    public static Node parent(Node root,Node pred){
        if (root.left == pred || root.right == pred) {
            return root;
        }
        Node temp = root.left;
        while (temp.right != pred) {
            temp = temp.right;
        }
        return temp;
    }

    public static Node deletenode(Node root,int key){
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null || root.right == null) {
                if (root.left == null) {
                    return root.right;
                }else{
                    return root.left;
                }
            }else{
                Node pred = iop(root);
                Node predparent = parent(root,pred);
                if (root == predparent) {
                    pred.right = root.right;
                    return pred;
                }
                predparent.right = null;
                pred.left = root.left;
                pred.right = root.right;
                return pred;
            }
        }else if (root.val > key) {
            root.left = deletenode(root.left, key);
        }else{
            root.right = deletenode(root.right, key);
        }
        return root;
    }
}