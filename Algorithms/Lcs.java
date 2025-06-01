package abc;

public class Lcs {

    public static String lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // dp[i][j] = LCS length for s1[0..i-1] and s2[0..j-1]
        int[][] dp = new int[n + 1][m + 1];

        // Fill dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Reconstruct LCS string from dp table (bottom-up)
        StringBuilder lcsStr = new StringBuilder();
        int i = n, j = m;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcsStr.insert(0, s1.charAt(i - 1)); // Add to front
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return lcsStr.toString();
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";

        String result = lcs(str1, str2);

        System.out.println("First String: " + str1);
        System.out.println("Second String: " + str2);
        System.out.println("Length of Longest Common Subsequence: " + result.length());
        System.out.println("Longest Common Subsequence: " + result);
    }
}
