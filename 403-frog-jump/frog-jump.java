
class Solution {
    public boolean canCross(int[] stones) {

        if(stones.length < 2 || stones[1] != 1)
            return false;
        int[][] dp = new int[stones.length][stones.length + 1];
        for(int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(stones, 0, 0, dp);
    }

    public boolean helper(int[] stones, int ind, int curr, int[][] dp) {
        if(ind == stones.length - 1)
            return true;
        if(dp[ind][curr] != -1)
            return dp[ind][curr] == 1;
        for(int jump = curr - 1; jump <= curr + 1; jump++) {
            if(jump <= 0)
                continue;
            int next = stones[ind] + jump;
            for(int i = ind + 1; i < stones.length; i++) {
                if(stones[i] == next) {
                    if(helper(stones, i, jump, dp)) {
                    dp[ind][curr] = 1;
                    return true;
                    }
                }
            }
        }
        dp[ind][curr] = 0;
        return false;
    }
}
