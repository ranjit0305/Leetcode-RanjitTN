class Solution {
    public int singleNumber(int[] nums) 
    {
        Arrays.sort(nums);
        int cnt=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]!=nums[i] && cnt==0)
            {
                return nums[i];
            }
            if(nums[i]==nums[i+1])
            {
                cnt=cnt+1;
            }
            else
            {
                cnt =0;
            }
        }    
        return nums[nums.length-1];
    }
}