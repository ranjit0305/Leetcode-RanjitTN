import java.util.Arrays;

class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        // Sort the array first
        Arrays.sort(nums);
        
        int left = 0;
        int right = nums[nums.length - 1] - nums[0];
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = countPairs(nums, mid);
            
            // If count is greater than or equal to k, move the right pointer
            if (count >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    
    private int countPairs(int[] nums, int mid) {
        int count = 0;
        int start = 0;
        
        for (int end = 0; end < nums.length; end++) {
            while (nums[end] - nums[start] > mid) {
                start++;
            }
            count += end - start;
        }
        
        return count;
    }
}
