package Module18Recursion;

public class A20Permutation {
    public static void printpermutation(String ans,String s){
        if (s.length()==0) {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i+1);
            printpermutation(ans+ch, left+right);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        printpermutation("",s);
    }
}