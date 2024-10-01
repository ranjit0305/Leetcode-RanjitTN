class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] remainderCount = new int[k];

        // Count the remainder frequencies
        for (int num : arr) {
            int remainder = num % k;
            if (remainder < 0) remainder += k;  // Handle negative remainders
            remainderCount[remainder]++;
        }

        // Check pairs
        for (int i = 1; i < k; i++) {
            if (remainderCount[i] != remainderCount[k - i]) {
                return false;  // If count of remainder 'i' and 'k-i' don't match, pairing is impossible
            }
        }

        // Special case for remainder 0
        return remainderCount[0] % 2 == 0;  // Ensure elements with remainder 0 can form pairs
    }
}
