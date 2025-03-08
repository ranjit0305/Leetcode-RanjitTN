class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0, minWhite = k;
        for (int i = 0; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'B') {
                count++;
            } else {
                count = 0;
            }
            if (count == k) {
                return 0;
            }
            if (i >= k - 1) {
                int whiteCount = 0;
                for (int j = i; j > i - k; j--) {
                    if (blocks.charAt(j) == 'W') {
                        whiteCount++;
                    }
                }
                minWhite = Math.min(minWhite, whiteCount);
            }
        }
        return minWhite;
    }
}
