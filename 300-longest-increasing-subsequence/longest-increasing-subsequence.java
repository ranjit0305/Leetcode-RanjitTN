class Solution {

    public int lengthOfLIS(int[] nums) {
        
        int[][] dp=new int[nums.length][nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return lis(0, -1, nums,dp);
    }

    public int lis(int index, int prevIndex, int[] nums,int[][] dp) {

        if(index == nums.length)
            return 0;
        
        if(dp[index][prevIndex+1]!=-1) return dp[index][prevIndex+1];
        // skip
        int skip = lis(index + 1, prevIndex, nums,dp);

        // take
        int take = 0;
        if(prevIndex == -1 || nums[index] > nums[prevIndex]) {
            take = 1 + lis(index + 1, index, nums,dp);
        }

        return dp[index][prevIndex+1]=Math.max(skip, take);
    }
}