class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] temp = new int[nums.length + 1];

        for(int i = 0; i < queries.length; i++) {
            temp[queries[i][0]]--;
            temp[queries[i][1] + 1]++;
        }

        int negCount = 0;
        for(int i = 0; i < nums.length; i++) {
            negCount += temp[i];
            if(nums[i] + negCount > 0) return false;
        }
        return true;
    }
}