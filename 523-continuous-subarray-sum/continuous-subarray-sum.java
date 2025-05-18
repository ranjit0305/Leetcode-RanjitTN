import java.util.HashMap;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) {
                sum %= k;
            }
            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                if (i - prevIndex >= 2) {
                    return true;
                }
            } else {
                map.put(sum, i);
            }
        }

        return false; // No such subarray found
    }
}
