class Solution {
    public long countSubarrays(int[] nums, long k) {
        long cnt=0;
        long sum=0;
        int left=0;
        for(int right=0;right<nums.length;right++)
        {
            sum=sum+nums[right];
            while(sum*(right-left+1)>=k)
            {
                sum=sum-nums[left];
                left++;
            }
            cnt=cnt+(right-left+1);
        }
    return cnt;
    }
}