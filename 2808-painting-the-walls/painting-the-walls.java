import java.util.*;

class Solution {

    public int paintWalls(int[] cost, int[] time) {

        int n = cost.length;
        int[][] dp = new int[n][n+1];

        for(int[] row : dp)
            Arrays.fill(row,-1);

        return findcost(0, cost, time, n, dp);
    }

    public int findcost(int index, int[] cost, int[] time, int walls, int[][] dp) {

        if(walls <= 0)
            return 0;

        if(index >= cost.length)
            return Integer.MAX_VALUE / 2;

        if(dp[index][walls] != -1)
            return dp[index][walls];

        // skip
        int skip = findcost(index + 1, cost, time, walls, dp);

        // take
        int take = cost[index] +
                   findcost(index + 1, cost, time, walls - 1 - time[index], dp);

        return dp[index][walls] = Math.min(skip, take);
    }
}