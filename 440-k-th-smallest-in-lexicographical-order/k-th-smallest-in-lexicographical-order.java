class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;  // Start from the first lexicographical number
        k = k - 1;     // We need to move k times to reach the k-th number
        
        while (k > 0) {
            // Calculate the number of steps between curr and curr + 1 in lexicographical order
            int steps = countSteps(n, curr, curr + 1);
            
            if (steps <= k) {
                // If the number of steps is less than or equal to k, move to the next number
                curr += 1;
                k -= steps;  // Decrease k by the number of steps we skipped
            } else {
                // If the k-th number is within this subtree, go deeper (multiply curr by 10)
                curr *= 10;
                k -= 1;  // Reduce k as we moved to the next level
            }
        }
        
        return curr;
    }
    
    // This function calculates the number of steps from curr to curr+1 within the range of 1 to n
    private int countSteps(int n, long curr, long next) {
        int steps = 0;
        while (curr <= n) {
            steps += Math.min(n + 1, next) - curr;
            curr *= 10;
            next *= 10;
        }
        return steps;
    }
}
