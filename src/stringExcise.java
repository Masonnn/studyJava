public class stringExcise {
    public static void main(String[] args) {
        stringExcise a = new stringExcise();
        String str = "ababaa";
        a.longestPalindrome(str);
    }

    private String longestPalindrome(String s) {
        int n = s.length();
        String res = "";
        boolean[][] dp = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) { //枚举起点
            for (int j = i; j < n; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1]);
                if (dp[i][j] && j - i + 1 > res.length()) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        System.out.println(res);
        return res;
    }
}
