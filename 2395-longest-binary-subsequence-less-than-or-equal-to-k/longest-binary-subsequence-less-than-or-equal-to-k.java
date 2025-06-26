class Solution {
    public int longestSubsequence(String s, int k) {
        int n = s.length();
        int count = 0;
        long value = 0;
        long power = 1;

        // Step 1: Traverse from the end
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch == '0') {
                count++;
                if (power <= k) power *= 2;
            } else {
                if (power > k) continue;
                if (value + power <= k) {
                    value += power;
                    count++;
                    power *= 2;
                }
            }
        }

        return count;
    }
}
