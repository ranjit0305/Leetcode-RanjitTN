
import java.util.*;

class Solution {
    public int coinChange(int[] coins, int amount) 
    {
        int index = coins.length-1;
        int[][] dp = new int[coins.length][amount+1];
        for(int[] row : dp)
        {
            Arrays.fill(row,-1);
        }
        int ans = helper(coins,amount,index,dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public int helper(int[] coins, int amount,int index,int[][] dp)
    {
        if(amount == 0)
        {
            return 0;
        }
        if(index < 0 || amount < 0)
        {
            return Integer.MAX_VALUE;
        }
        if(dp[index][amount] != -1)
        {
            return dp[index][amount];
        }
        // take
        int take = helper(coins,amount-coins[index],index,dp);
        if(take != Integer.MAX_VALUE)
        {
            take = take+1;
        }
        // skip
        int nottake = helper(coins,amount,index-1,dp);
        return dp[index][amount] = Math.min(take,nottake);
    }
}
