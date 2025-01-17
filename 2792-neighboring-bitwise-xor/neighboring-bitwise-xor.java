class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xorSum = 0; // Initialize XOR sum
        for (int n : derived) {
            xorSum ^= n; // XOR each element
        }
        return xorSum == 0; // If XOR sum is 0, return true
    }
}