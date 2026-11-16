
class Solution {
    public int maxProfit(int[] prices) 
    {
        int[][] dp = new int[prices.length][2];

        for(int i=0;i<prices.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }

        return helper(0,prices,0,dp);
    }

    public int helper(int index,int[] prices,int buy,int[][] dp)
    {
        if(index==prices.length) return 0;

        if(dp[index][buy]!=-1)
            return dp[index][buy];

        int profit;

        if(buy==0)
        {
            int yes=-prices[index]+helper(index+1,prices,1,dp);
            int no=helper(index+1,prices,0,dp);

            profit=Math.max(yes,no);
        }
        else
        {
            int yes=prices[index]+helper(index+1,prices,0,dp);
            int no=helper(index+1,prices,1,dp);

            profit=Math.max(yes,no);
        }

        return dp[index][buy]=profit;
    }
}
