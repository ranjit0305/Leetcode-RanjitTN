class Solution {
    public int combinationSum4(int[] nums, int target) {

        int[][] dp = new int[target + 1][nums.length + 1];
        for(int i = 0; i <= target; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(nums, target, 0, dp);
    }

    public int helper(int[] nums, int target, int index, int[][] dp) {

        if(target == 0) {
            return 1;
        }
        if(index == nums.length) {
            return 0;
        }
        if(dp[target][index] != -1) {
            return dp[target][index];
        }
        int take = 0;
        if(nums[index] <= target) {
            take = helper(nums, target - nums[index], 0, dp);
        }
        int nottake = helper(nums, target, index + 1, dp);
        return dp[target][index] = take + nottake;
    }
}