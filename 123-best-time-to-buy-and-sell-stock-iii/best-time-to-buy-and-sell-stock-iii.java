
class Solution {
    public int maxProfit(int[] prices) 
    {
        int[][][] dp = new int[prices.length][2][3];
        for(int i=0;i<prices.length;i++)
        {
            for(int j=0;j<2;j++)
            {
                Arrays.fill(dp[i][j],-1);
            }
        }
        return helper(0,prices,0,2,dp);
    }
    public int helper(int index,int[] prices,int buy,int cap,int[][][] dp)
    {
        if(index==prices.length || cap==0) return 0;
        if(dp[index][buy][cap]!=-1)
            return dp[index][buy][cap];
        int profit;
        if(buy==0)
        {
            int yes=-prices[index]+helper(index+1,prices,1,cap,dp);
            int no=helper(index+1,prices,0,cap,dp);

            profit=Math.max(yes,no);
        }
        else
        {
            int yes=prices[index]+helper(index+1,prices,0,cap-1,dp);
            int no=helper(index+1,prices,1,cap,dp);

            profit=Math.max(yes,no);
        }
        return dp[index][buy][cap]=profit;
    }
}
