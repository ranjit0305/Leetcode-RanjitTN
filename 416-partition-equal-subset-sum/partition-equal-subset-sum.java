
class Solution {
    public boolean canPartition(int[] nums) 
    {
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
        }

        if(total%2!=0) return false;

        int target=total/2;

        int[][] dp=new int[nums.length][target+1];

        for(int[] row:dp)
            Arrays.fill(row,-1);

        return helper(nums,0,0,target,dp);
    }

    public boolean helper(int[] nums,int index,int sum,int target,int[][] dp)
    {
        if(sum==target) return true;

        if(index==nums.length || sum>target)
            return false;

        if(dp[index][sum]!=-1)
            return dp[index][sum]==1;

        boolean take=helper(nums,index+1,sum+nums[index],target,dp);

        boolean nottake=helper(nums,index+1,sum,target,dp);

        dp[index][sum]=(take || nottake) ? 1 : 0;

        return dp[index][sum]==1;
    }
}
