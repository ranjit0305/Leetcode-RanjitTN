class Solution {
    public int countHillValley(int[] nums) {
        int cnt = 0;
        for (int i = 1; i < nums.length - 1; i++) 
        {
            if (nums[i] == nums[i - 1]) continue;
            int left = nums[i - 1];
            int right = nums[i + 1];
            int j = i - 1;
            while (j >= 0 && nums[j] == nums[i]) {
                j--;
            }
            if (j >= 0) left = nums[j];
            j = i + 1;
            while (j < nums.length && nums[j] == nums[i])
            {
                j++;
            }
            if (j < nums.length)
            {
                 right = nums[j];
            }
            if (nums[i] < left && nums[i] < right) {
                cnt++;
            } else if (nums[i] > left && nums[i] > right) {
                cnt++;
            }
        }
        return cnt;
    }
}
