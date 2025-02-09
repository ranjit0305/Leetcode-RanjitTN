import java.util.HashMap;

class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        long totalPairs = (long) nums.length * (nums.length - 1) / 2;
        long goodPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i] - i;
            if (freq.containsKey(key)) {
                goodPairs += freq.get(key);
            }
            freq.put(key, freq.getOrDefault(key, 0) + 1);
        }
        return totalPairs - goodPairs;
    }
}
