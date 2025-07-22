class Solution {
    public int maximumUniqueSubarray(int[] nums) 
    {
        int left=0;
        int tempsum=0;
        int max=0;
        Set<Integer> arr=new HashSet<>();
        for(int right=0;right<nums.length;right++)
        {
            while(arr.contains(nums[right]))
            {
                arr.remove(nums[left]);
                tempsum=tempsum-nums[left];
                left++;
            }
            arr.add(nums[right]);
            tempsum=tempsum+nums[right];
            max=Math.max(max,tempsum);
        }
        return max;
    }
}