import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums); // Sort the array
        if (nums.length == 0) {
            return 0;
        }

        int start = nums[0];
        int cnt = 1; 
        int maxCount = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == start + 1) {
                cnt++;
                start = nums[i];
            } else if (nums[i] != start) { 
                start = nums[i]; 
                cnt = 1; 
            }
            maxCount = Math.max(maxCount, cnt); // Update maxCount
        }

        return maxCount;
    }
}
