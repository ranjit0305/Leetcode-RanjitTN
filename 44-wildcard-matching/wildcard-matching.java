
class Solution {
    public boolean isMatch(String s, String p) {
        int n1 = s.length();
        int n2 = p.length();

        int[][] dp = new int[n1 + 1][n2 + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(s, p, 0, 0, dp);
    }

    public boolean helper(String s, String p, int index1, int index2, int[][] dp) {

        if (index1 >= s.length() && index2 >= p.length()) {
            return true;
        }

        if (index2 >= p.length()) {
            return false;
        }

        if (dp[index1][index2] != -1) {
            return dp[index1][index2] == 1;
        }

        if (index1 >= s.length()) {
            for (int i = index2; i < p.length(); i++) {
                if (p.charAt(i) != '*') {
                    return false;
                }
            }
            return true;
        }

        if (s.charAt(index1) == p.charAt(index2) || p.charAt(index2) == '?') {

            if (helper(s, p, index1 + 1, index2 + 1, dp)) {
                dp[index1][index2] = 1;
            } else {
                dp[index1][index2] = 0;
            }
        }
        else if (p.charAt(index2) == '*') {

            boolean skip1 = helper(s, p, index1 + 1, index2, dp);
            boolean skip2 = helper(s, p, index1, index2 + 1, dp);

            if (skip1 || skip2) {
                dp[index1][index2] = 1;
            } else {
                dp[index1][index2] = 0;
            }
        }
        else {
            dp[index1][index2] = 0;
        }

        return dp[index1][index2] == 1;
    }
}
