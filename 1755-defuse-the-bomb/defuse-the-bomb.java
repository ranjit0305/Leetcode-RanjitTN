class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length; // Get the length of the array
        int[] result = new int[n]; // Initialize result array

        for (int i = 0; i < n; i++) {
            int sum = 0;
            if (k == 0) {
                result[i] = 0; // If k is 0, set the current element to 0
            } else if (k > 0) {
                // Sum the next k numbers, using modulo to wrap around
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
                result[i] = sum;
            } else { 
                // Sum the previous k numbers, using modulo to wrap around
                for (int l = 1; l <= -k; l++) {
                    sum += code[(i - l + n) % n]; // (i - l + n) ensures positive index
                }
                result[i] = sum;
            }
        }

        return result;
    }
}
