package Module34dp3a;

public class A4palindromicsubstring {
    public static void main(String[] args) {
        String testString1 = "abba"; 
        System.out.println("Count of palindromic substrings in '" + testString1 + "': " + countpalsubstr(testString1));
    }

    public static int countpalsubstr(String s) {
        int n = s.length();
        int count = 0;
        int[][] dp = new int[n][n];
        for (int k = 0; k < n; k++) {
            int i = 0;
            int j = k;
            while (j < n) {
                if (i == j) {
                    dp[i][j] = 1;
                    count++;
                } else if (j == i + 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = 1;
                        count++;
                    }
                } else {
                    if (s.charAt(i) == s.charAt(j)) {
                        if (dp[i + 1][j - 1] == 1) {
                            dp[i][j] = 1;
                            count++;
                        }
                    }
                }
                i++;
                j++;
            }
        }
        return count;
    }
}
