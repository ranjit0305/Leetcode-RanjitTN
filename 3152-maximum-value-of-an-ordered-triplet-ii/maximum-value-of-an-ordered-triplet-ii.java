class Solution {
    public long maximumTripletValue(int[] nums)
    {
        long[] prefix_max=new long[nums.length];
        long[] suffix_max=new long[nums.length];
        long maxTriplet=0;
        prefix_max[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            prefix_max[i]=Math.max(prefix_max[i-1],nums[i]);
        }
        suffix_max[nums.length-1]=nums[nums.length-1];
        for(int j=nums.length-2;j>=0;j--)
        {
            suffix_max[j]=Math.max(suffix_max[j+1],nums[j]);
        }
        long ans=0;
        for(int i=1;i<nums.length-1;i++)
        {
            long left=prefix_max[i-1];
            long right=suffix_max[i+1];
            ans=Math.max(ans,(int)(left-nums[i])*right);
        }
        return ans;
    }
}