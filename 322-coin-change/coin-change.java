class Solution {
        public int coinChange(int[] coins, int amount) {
        int n = amount + 1;
        int[] dp = new int[n];

        // Initialize all values as a large number (infinity equivalent)
        for (int i = 0; i < n; i++) {
            dp[i] = n;
        }

        // Base case: 0 amount needs 0 coins
        dp[0] = 0;

        // Build up the dp array
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                int coin = coins[j];
                if (i >= coin) {
                    if (dp[i - coin] + 1 < dp[i]) {
                        dp[i] = dp[i - coin] + 1;
                    }
                }
            }
        }

        // If dp[amount] is still the initial large value, return -1
        if (dp[amount] == n) {
            return -1;
        } else {
            return dp[amount];
        }
    }
}