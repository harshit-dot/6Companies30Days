public class Solution {
    public int getMoneyAmount(int n) {
        if (n == 1) {
            return 0;
        }
        int[][] dp = new int[n + 1][n + 1];
        for (int ii = 1; ii < n; ii++) {
            for (int i = 0; i + ii <= n; i++) {
                int j = i + ii;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j; k++) {
                    dp[i][j] = Math.min(dp[i][j],
                                        k + Math.max(k - 1 >= i ? dp[i][k - 1] : 0,
                                                     j >= k + 1 ? dp[k + 1][j] : 0));
                }
            }
        }
        return dp[1][n];
    }
}