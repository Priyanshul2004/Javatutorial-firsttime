package Module18Recursion;

public class A17subset {
    public static void printsubset(int i,String s,String ans){
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        printsubset(i+1, s, ans+ch);
        printsubset(i+1, s, ans);
    }
    public static void main(String[] args) {
        String s = "abc";
        printsubset(0,s,"");
    }
}
