class Solution {
    public int minimumDifference(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int i=nums.length-1;
        int n=nums.length;
        int min_dif=Integer.MAX_VALUE;
        if(n==1)
        {
            return 0;
        }
        while(i>=0)
        {
            if(i-k+1>=0)
            {
                min_dif=Math.min(min_dif,nums[i]-nums[i-k+1]);
            }
            i--;
        }
        return min_dif;
    }
}