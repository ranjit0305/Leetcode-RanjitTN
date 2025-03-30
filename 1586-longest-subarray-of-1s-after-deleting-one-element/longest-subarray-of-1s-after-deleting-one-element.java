import java.util.*;

class Solution {
    public int longestSubarray(int[] nums) {
        int tmp = 0;
        int zerocnt = 0;
        List<Integer> prefix = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                tmp++;
            } else {
                prefix.add(tmp);
                tmp = 0;
                zerocnt++;
            }
        }
        prefix.add(tmp);
        if (zerocnt == 0) {
            return nums.length - 1;
        }
        int maxCount = Integer.MIN_VALUE;
        for (int i = 0; i < prefix.size() - 1; i++) {
            maxCount = Math.max(maxCount, prefix.get(i) + prefix.get(i + 1));
        }
        return maxCount;
    }
}
