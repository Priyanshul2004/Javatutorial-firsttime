package Module34dp2;
public class A5longestcommonsubsequence {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "ace";
        int result = longestcommentsubseq(a, b);
        System.out.println("The length of the longest common subsequence is: " + result);
    }
    public static int longestcommentsubseq(String a,String b){
        int m = a.length();
        int n = b.length();
        if (m==0 || n==0) {
            return 0;
        }
        String a2 = a.substring(0, m-1);
        String b2 = b.substring(0, n-1);

        if (a.charAt(m-1) == b.charAt(n-1)) {
            return 1+longestcommentsubseq(a2, b2);
        }else{
            return Math.max(longestcommentsubseq(a,b2), longestcommentsubseq(a2,b));
        }
    }
}