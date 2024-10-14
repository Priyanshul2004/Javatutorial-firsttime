package Module18Recursion;

public class A13zizzec {
    public static void pip(int n){
        if (n==0) return;
        System.out.print(n); // pre
        //System.out.println("pre");
        pip(n-1);
        System.out.print(n);  // in
        //System.out.println("in");
        pip(n-1);
        System.out.print(n); // post
        //System.out.println("post");
    }
    public static void main(String[] args) {
        pip(3);
    }
}
