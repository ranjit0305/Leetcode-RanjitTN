class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closesum = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int tempsum = nums[i] + nums[j] + nums[k];
                if (tempsum == target) {
                    return tempsum;
                }
                if (Math.abs(tempsum - target) < Math.abs(closesum - target)) {
                    closesum = tempsum;
                }
                if (tempsum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return closesum;
    }
}
