class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) 
    {
        for(int i=0;i<k;i++)
        {
            int min=nums[0];
            int min_index=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]<min)
                {
                    min=nums[j];
                    min_index=j;
                }
            }
            nums[min_index]=nums[min_index]*multiplier;
        }    
        return nums;
    }
}