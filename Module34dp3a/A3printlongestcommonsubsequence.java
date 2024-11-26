package Module34dp3a;

public class A3printlongestcommonsubsequence {
    public static void main(String[] args) {
        String a = "AGGTAB";
        String b = "GXTXAYB";
        int length = longestcomnsubseq(a, b);
        System.out.println("Length of Longest Common Subsequence: " + length);
    }

    public static int longestcomnsubseq(String a, String b) {
        int m = a.length(), n = b.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        StringBuilder str = new StringBuilder("");
        int i = m;
        int j = n;
        while (i > 0 && j > 0) {
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                str.append(a.charAt(i - 1));
            }
            if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        str.reverse();
        System.out.println(str);
        return dp[m][n];
    }
}