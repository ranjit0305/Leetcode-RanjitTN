class Solution {
    public int minOperations(int[] nums, int k) {
        List<Integer> arr = new ArrayList<>();
        int cnt = 0;
        boolean hasLessThanK = false;
        
        for (int i = 0; i < nums.length; i++) {
            if (!arr.contains(nums[i])) {
                arr.add(nums[i]);
            }
        }
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > k) {
                cnt++;
            }
            if (arr.get(i) < k) {
                hasLessThanK = true;
            }
        }
        
        if (hasLessThanK) {
            return -1;
        }
        
        return cnt;
    }
}
