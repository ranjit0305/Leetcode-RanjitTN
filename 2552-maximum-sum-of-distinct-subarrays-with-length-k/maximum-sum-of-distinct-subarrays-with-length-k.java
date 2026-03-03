class Solution {
    public long maximumSubarraySum(int[] nums, int k) 
    {
        long maxSum=0;
        int begin=0;
        long currentsum=0;
        Set<Integer> arr=new HashSet<>();
        for(int end=0;end<nums.length;end++)
        {
            if(!arr.contains(nums[end]))
            {
                currentsum+=nums[end];
                arr.add(nums[end]);

                if(end-begin+1==k)
                {
                    maxSum=Math.max(currentsum,maxSum);
                    currentsum-=nums[begin];
                    arr.remove(nums[begin]);
                    begin++;
                }
            }
            else
            {
                while(nums[begin]!=nums[end])
                {
                    currentsum-=nums[begin];
                    arr.remove(nums[begin]);
                    begin++;
                }
                begin++;
            }
        }
        return maxSum;
    }
}