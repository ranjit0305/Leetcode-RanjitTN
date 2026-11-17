class Solution {
    public int numDistinct(String s, String t) 
    {
        int[][] dp=new int[s.length()][t.length()];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return helper(s,t,0,0,dp);    
    }
    public int helper(String s, String t,int index1,int index2,int[][] dp)
    {
        if (index2==t.length())
        {
            return 1;
        }
        if (index1==s.length())
        {
            return 0;
        }
        if(dp[index1][index2]!=-1) return dp[index1][index2];
        int take=0;
        if(s.charAt(index1)==t.charAt(index2))
        {
            take=helper(s,t,index1+1,index2+1,dp);
        }
        int nottake=helper(s,t,index1+1,index2,dp);
        return dp[index1][index2]=take+nottake;
    }
}