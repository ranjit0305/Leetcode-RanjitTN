class Solution {
    public int findPeakElement(int[] nums) 
    {
        int index=0;
        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
            {
                index=i;
                return index;
            }
        }    
        if(nums[0]>nums[nums.length-1])
        {
            return 0;
        }
        return nums.length-1;
    }
}