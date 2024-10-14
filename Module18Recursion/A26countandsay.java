// by using  loop 
package Module18Recursion;

public class A26countandsay {

    public static String countandsay(int n) {
        if (n == 1) {
            return "1";
        }
        
        String s = countandsay(n - 1);
        String ans = "";
        int i = 0;
        
        while (i < s.length()) {
            int j = i;
            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                j++;
            }
            int len = j - i;
            ans += len;
            ans += s.charAt(i);
            i = j;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countandsay(3));
    }
}

