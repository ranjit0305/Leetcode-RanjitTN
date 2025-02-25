class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minval = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                minval = Math.min(minval, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return (minval == Integer.MAX_VALUE) ? 0 : minval;
    }
}
