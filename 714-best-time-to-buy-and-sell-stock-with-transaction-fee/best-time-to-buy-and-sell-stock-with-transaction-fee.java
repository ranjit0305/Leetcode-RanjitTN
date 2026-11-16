class Solution {
    public int maxProfit(int[] prices, int fee) 
    {
        int index=0;
        int opt=0;
        int[][] dp=new int[prices.length][2];
        for(int i=0;i<prices.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return helper(prices,fee,index,opt,dp); 
    }
    public int helper(int[] prices,int fee,int index,int opt,int[][] dp)
    {
        if(index==prices.length) return 0;
        int profit;
        if(dp[index][opt]!=-1) return dp[index][opt];
        //buy
        if(opt==0)
        {
            int yes=-prices[index]+helper(prices,fee,index+1,1,dp);
            int no=helper(prices,fee,index+1,0,dp);
            profit=Math.max(yes,no);
        }
        else
        {
            int yes=prices[index]-fee+helper(prices,fee,index+1,0,dp);
            int no=helper(prices,fee,index+1,1,dp);
            profit=Math.max(yes,no);
        }
        return dp[index][opt]=profit;
    }
}