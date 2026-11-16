class Solution {
    public int findTargetSumWays(int[] nums, int target) 
    {
        int index=0;
        return helper(nums,target,index,0,0);
    }
    public int helper(int[] nums,int target,int index,int cnt,int sum)
    {
        if(index==nums.length)
        {
            if(target==sum)
            {
            cnt=cnt+1;
            }
            return cnt;
        }
        
        //add
        int take=helper(nums,target,index+1,cnt,sum+nums[index]);
        //minus
        int nottake=helper(nums,target,index+1,cnt,sum-nums[index]);

        return take+nottake;
    }
}