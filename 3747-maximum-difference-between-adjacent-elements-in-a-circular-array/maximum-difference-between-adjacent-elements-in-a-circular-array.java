class Solution {
    public int maxAdjacentDistance(int[] nums) 
    {
        int maxdist=0;
        for(int i=0;i<nums.length;i++)
        {
            int diff=0;        
            if(i+1>=nums.length)
            {
                diff=Math.abs(nums[0]-nums[nums.length-1]);    
            }
            else
            {
                diff=Math.abs(nums[i]-nums[i+1]);
            }
            maxdist=Math.max(diff,maxdist);
        }    
        return maxdist;
    }
}