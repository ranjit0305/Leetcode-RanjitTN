class Solution {
    public long maxTotalValue(int[] nums, int k) {

        long maxi = Long.MIN_VALUE;
        long mini = Long.MAX_VALUE;

        for(int x : nums)
        {
            maxi = Math.max(maxi, x);
            mini = Math.min(mini, x);
        }

        return (maxi - mini) * k;
    }
}