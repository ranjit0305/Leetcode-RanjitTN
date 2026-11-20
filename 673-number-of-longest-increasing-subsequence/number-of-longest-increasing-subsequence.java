class Solution {
    int[][] dp;
    int[][] count;

    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;

        dp = new int[n + 1][n + 1];
        count = new int[n + 1][n + 1];

        for(int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        helper(nums, 0, -1);

        return count[0][0];
    }

    public int helper(int[] nums, int index, int prev) {

        if(index == nums.length) {
            return 0;
        }

        if(dp[index][prev + 1] != -1) {
            return dp[index][prev + 1];
        }

        int take = 0;

        if(prev == -1 || nums[index] > nums[prev]) {
            take = 1 + helper(nums, index + 1, index);
        }

        int notTake = helper(nums, index + 1, prev);

        int max = Math.max(take, notTake);

        int ways = 0;

        if(take == max && (prev == -1 || nums[index] > nums[prev])) {
            ways += (index + 1 == nums.length)
                    ? 1 : count[index + 1][index + 1];
        }

        if(notTake == max) {
            ways += (index + 1 == nums.length)
                    ? 1 : count[index + 1][prev + 1];
        }

        dp[index][prev + 1] = max;
        count[index][prev + 1] = ways;

        return max;
    }
}