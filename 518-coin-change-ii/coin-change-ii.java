
class Solution {
    public int change(int amount,int[] coins) 
    {
        int index = coins.length-1;

        int[][] dp = new int[coins.length][amount+1];

        for(int[] row : dp)
        {
            Arrays.fill(row,-1);
        }

        int ans = helper(coins,amount,index,dp);

        return ans;
    }

    public int helper(int[] coins, int amount,int index,int[][] dp)
    {
        if(amount == 0)
        {
            return 1;
        }
        if(index == -1) return 0;
        
        if(dp[index][amount] != -1)
        {
            return dp[index][amount];
        }

        // take
        int take=0;
        if(amount>=coins[index])
        {
        take = helper(coins,amount-coins[index],index,dp);
        }
        // skip
        int nottake = helper(coins,amount,index-1,dp);

        return dp[index][amount] = take+nottake;
    }
}
