class Solution {
    public int rob(int[] nums)
    {
        int dp[] =new int[nums.length];
        Arrays.fill(dp,-1);
        int first=findMaxProf(0,nums,dp);
        int second=findMaxProf(1,nums,dp);
        return Math.max(first,second);
    }
    public int findMaxProf(int index,int[] nums,int[] dp) 
    {
        if(index >= nums.length)
        {
            return 0;
        }
        if (dp[index]!=-1) return dp[index];
        //skip
        int skip=findMaxProf(index+1,nums,dp);
        //take
        int take=nums[index]+findMaxProf(index+2,nums,dp);
        return dp[index]=Math.max(skip,take);
    }
}