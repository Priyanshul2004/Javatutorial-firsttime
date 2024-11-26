package Module30binarysearchtree;
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}
public class A7lowestcommanancestorofbst {
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

        System.out.println(lowestcommancestor(a, f, g));
    }
    public static Node lowestcommancestor(Node root,Node p,Node q){
        if (root.val<p.val && root.val<q.val) {
            return lowestcommancestor(root.right, p, q);
        }else if (root.val>p.val&&root.val>q.val) {
            return lowestcommancestor(root.left, p, q);
        }else{
            return root;
        }
    }
}
