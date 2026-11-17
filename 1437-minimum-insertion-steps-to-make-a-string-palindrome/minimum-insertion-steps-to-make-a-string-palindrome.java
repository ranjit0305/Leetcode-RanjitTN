class Solution {
    public int minInsertions(String s) {
        int s_index=0;
        int e_index=s.length()-1;
        int cnt=0;
        int[][] dp=new int[s.length()][s.length()];
        for(int[] row : dp) {
            Arrays.fill(row,-1);
        }
        int x=longestpalindrome(s,s_index,e_index,dp);
        return s.length()-x;
    }
    public int longestpalindrome(String s,int s_index,int e_index,int[][] dp)
    {
        if(s_index>e_index) return 0;
        if(s_index==e_index) return 1;
        if(dp[s_index][e_index]!=-1) return dp[s_index][e_index];

        if(s.charAt(s_index)==s.charAt(e_index))
        {
            dp[s_index][e_index]=2+longestpalindrome(s,s_index+1,e_index-1,dp);
        }
        else
        {
            dp[s_index][e_index]=Math.max(longestpalindrome(s,s_index,e_index-1,dp),longestpalindrome(s,s_index+1,e_index,dp));
        }
        return dp[s_index][e_index];
    }
}