class Solution {
    private int[][] dp;

    private int minTurns(int left, int right, String s) {
        //base condition1
        if (left == right) {
            return 1;
        }
        //basecondition2
        if (left > right) {
            return 0;
        }
        //dp arrycheck
        if (dp[left][right] != -1) {
            return dp[left][right];
        }
        //traversing string
        int next = left + 1;
        while (next <= right && s.charAt(left) == s.charAt(next)) {
            next++;
        }
        //end condition
        if (next == right + 1) {
            return 1;
        }
        //GREEDY APPROACH
        int minTurnsWithoutSplit = 1 + minTurns(next, right, s);
        int minTurnsWithSplit = Integer.MAX_VALUE;

        for (int split = next; split <= right; split++) {
            if (s.charAt(left) == s.charAt(split)) {
                int turns = minTurns(next, split - 1, s) + minTurns(split, right, s);
                minTurnsWithSplit = Math.min(minTurnsWithSplit, turns);
            }
        }

        return dp[left][right] = Math.min(minTurnsWithSplit, minTurnsWithoutSplit);
    }

    public int strangePrinter(String s) {
        int n = s.length();
        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return minTurns(0, n - 1, s);
    }
}
