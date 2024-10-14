package Module18Recursion;

public class A15trivarseinstring {
    public static void prints(int i, String s){
        if (i == s.length()) {
            return;
        }
        System.out.println(s.charAt(i));
        prints(i+1, s);
    }
    public static void main(String[] args) {
        String s = "priyanshul";
        prints(0,s);
    }
}
