class Solution {
    public int maximumCount(int[] nums) 
    {
        int cntpos=0;
        int cntneg=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                cntpos++;
            }
            if(nums[i]<0){
                cntneg++;
            }
        }    
        return Math.max(cntpos,cntneg);
    }
}