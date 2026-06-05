class Solution {
    public int maximumGap(int[] nums) 
    {
        Arrays.sort(nums);
        if(nums.length<2) return 0;
        int max_diff=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]>max_diff)
            {
                max_diff=nums[i]-nums[i-1];
            }
        }    
        return max_diff;
    }
}