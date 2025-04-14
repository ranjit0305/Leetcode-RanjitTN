class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return new int[]{-1, -1};
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        int left = low;
        if (nums[low] != target) {
            return new int[]{-1, -1};
        }
        high = n - 1;
        while (low < high) {
            int mid = (low + high) / 2 + 1;
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid;
            }
        }
        return new int[]{left, high};
    }
}