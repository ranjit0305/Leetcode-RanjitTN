import java.util.Arrays;

class Solution {
    public boolean divideArray(int[] nums) {
        int pair = nums.length / 2;
        Arrays.sort(nums);
        int pairs = 0;
        int i = 0;
        while (i < nums.length && (i + 1 < nums.length)) {
            if (nums[i] == nums[i + 1]) {
                pairs++;
            }
            i += 2;
        }
        return pairs == pair;
    }
}
