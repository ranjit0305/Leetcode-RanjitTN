class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0]; // Initialize with first element
        int pre = 1, suf = 1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suf == 0) suf = 1;
            pre *= nums[i];       
            suf *= nums[n - i - 1]; 
            result = Math.max(result, Math.max(pre, suf));
        }
        return result;
    }
}
