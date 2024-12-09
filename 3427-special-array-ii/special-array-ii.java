class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int m = queries.length;  // Number of queries
        boolean[] ans = new boolean[m];  // Result array to store boolean answers for each query

        // Prepare prefix array to store the count of consecutive elements with the same parity
        int n = nums.length;
        int[] prefix = new int[n];  // Prefix array to track same parity counts

        // Calculate prefix array
        for (int i = 1; i < n; i++) {//start from 1
            if (nums[i] % 2 == nums[i - 1] % 2) {  // Check if current and previous elements have the same parity
                prefix[i] = 1 + prefix[i - 1];  // Increment the count of same parity pairs
            } else {
                prefix[i] = prefix[i - 1];  // No increment, carry forward the previous count
            }
        }

        // Process each query
        for (int i = 0; i < m; i++) {
            int s = queries[i][0];  // Start index of the query range
            int e = queries[i][1];  // End index of the query range
            ans[i] = (prefix[e] - prefix[s] == 0);  // Check if no consecutive same parity elements exist in the range
        }

        return ans;  // Return the result array
    }
}