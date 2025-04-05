class Solution {
    public int subsetXORSum(int[] nums) {
        int totalSum = 0;
        int totalSubsets = (int) Math.pow(2, nums.length);

        for (int i = 0; i < totalSubsets; i++) {
            int xor = 0;
            int temp = i;
            int index = 0;
            while (temp > 0) {
                if (temp % 2 == 1) {
                    xor ^= nums[index];
                }
                temp /= 2;
                index++;
            }
            totalSum += xor;
        }
        return totalSum;
    }
}
