class Solution {
    public int findLengthOfLCIS(int[] nums) 
    {
        int max=0;
        int cnt=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                cnt++;
                max=Math.max(cnt,max);
            }
            else
            {
                
                cnt=0;
            }
        }    
        return max+1;
    }
}