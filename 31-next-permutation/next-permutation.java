class Solution {
    
    //Method to reverse array
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n == 1) return;
        int i = n - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) j--;
            //Swap the considered element with next greater element in the subarray
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            //Reverse the subarray
            reverse(nums, i + 1, n - 1);
            return;
        }
        reverse(nums, 0, n - 1);
    }
}