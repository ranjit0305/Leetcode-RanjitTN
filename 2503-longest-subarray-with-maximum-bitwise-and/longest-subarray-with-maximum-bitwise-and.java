class Solution {
    public int longestSubarray(int[] nums) 
    {
        int cnt=0;
        int ans=1;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(max==nums[i])
            {
                cnt++;
            }
            else
            {
                cnt=0;
            }
            ans=Math.max(ans,cnt);
        }
    return ans;
    }
}