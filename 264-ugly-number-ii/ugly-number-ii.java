class Solution {
    public int nthUglyNumber(int n) {
        int[] nums = new int[n];
        nums[0] = 1; // The first ugly number is 1
        int i2 = 0, i3 = 0, i5 = 0; // Initial positions of the pointers for 2, 3, 5

        for (int i = 1; i < n; i++) {
            // Calculate the next ugly number by taking the minimum
            int nextNum = Math.min(nums[i2] * 2, Math.min(nums[i3] * 3, nums[i5] * 5));
            nums[i] = nextNum;

            // Increment the pointer that corresponds to the chosen multiplier
            if (nextNum == nums[i2] * 2) i2++;
            if (nextNum == nums[i3] * 3) i3++;
            if (nextNum == nums[i5] * 5) i5++;
        }

        // The nth ugly number is stored at the last index
        return nums[n - 1];
    }
}
