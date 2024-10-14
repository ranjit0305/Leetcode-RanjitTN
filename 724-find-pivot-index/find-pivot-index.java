class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len + 1];
        int[] postfix = new int[len + 1];

        for (int i = 0; i < len; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        for (int i = len - 1; i >= 0; i--) {
            postfix[i] = postfix[i + 1] + nums[i];
        }

        for (int i = 0; i < len; i++) {
            if (prefix[i] == postfix[i + 1]) {
                return i;
            }
        }

        return -1;
    }
}