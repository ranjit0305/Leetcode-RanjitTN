class Solution {
    public int partitionArray(int[] nums, int k) {
        int cnt=0;
        Arrays.sort(nums);
        int start=nums[0];
        int i=1;
        while(i<nums.length)
        {
            if(nums[i]-start>k)
            {
                cnt++;
                start=nums[i];
            }
            i++;
        }
        return cnt+1;
    }
}