import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int maxScore(int[] nums) {
        int cnt = 0;
        long prefixSum = 0;
        Arrays.sort(nums);
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            if (prefixSum > 0) {
                cnt++;
            } else {
                break;
            }
        }

        return cnt;
    }
}
