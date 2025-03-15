class Solution {
    public int minCapability(int[] nums, int k) {
        int left = Integer.MAX_VALUE, right = Integer.MIN_VALUE;
        for (int num : nums) {
            left = Math.min(left, num);   // Minimum element in nums[]
            right = Math.max(right, num); // Maximum element in nums[]
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSelect(nums, k, mid)) {
                right = mid; // Try a smaller max capability
            } else {
                left = mid + 1; // Increase the capability limit
            }
        }
        return left;
    }

    private boolean canSelect(int[] nums, int k, int maxCap) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= maxCap) {
                count++;
                i++; // Skip adjacent element to maintain non-adjacency
            }
        }
        return count >= k;
    }
}
