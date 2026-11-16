class Solution {
    public int longestPalindromeSubseq(String s) {
        int index=0;
        int[][] dp=new int[s.length()][s.length()];
         for(int[] row : dp) {
            Arrays.fill(row,-1);
        }
        return helper(s,index,s.length()-1,dp);
    }
    public int helper(String s,int s_index,int e_index,int[][] dp)
    {
        if(s_index>e_index) return 0;
        if(s_index==e_index) return 1;
        if(dp[s_index][e_index]!=-1) return dp[s_index][e_index];
        if(s.charAt(s_index)==s.charAt(e_index))
        {
        dp[s_index][e_index]=2+helper(s,s_index+1,e_index-1,dp);
        }
        else
        {
        dp[s_index][e_index]=Math.max(helper(s,s_index+1,e_index,dp),helper(s,s_index,e_index-1,dp));
        }
        return dp[s_index][e_index];
    }
}