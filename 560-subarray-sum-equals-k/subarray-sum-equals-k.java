class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int sum = 0; // Initialize sum for the current subarray
            
            for (int j = i; j < nums.length; j++) {
                sum += nums[j]; // Add the current element to the sum
                
                if (sum == k) {
                    cnt++; // Increment count if the sum matches k
                }
            }
        }
        
        return cnt; // Return the total count of subarrays
    }
}
