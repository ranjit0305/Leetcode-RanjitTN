import java.util.*;

class Solution {

    int[][] dp;

    public int lengthOfLIS(int[] nums) {

        int n = nums.length;
        dp = new int[n][n+1];

        for(int[] row : dp)
            Arrays.fill(row, -1);

        return lis(0, -1, nums);
    }

    public int lis(int index, int prevIndex, int[] nums) {

        if(index == nums.length)
            return 0;

        if(dp[index][prevIndex + 1] != -1)
            return dp[index][prevIndex + 1];

        int skip = lis(index + 1, prevIndex, nums);

        int take = 0;
        if(prevIndex == -1 || nums[index] > nums[prevIndex])
            take = 1 + lis(index + 1, index, nums);

        return dp[index][prevIndex + 1] = Math.max(skip, take);
    }
}