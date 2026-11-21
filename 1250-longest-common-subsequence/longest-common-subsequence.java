class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int[][] dp=new int[m][n];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return helper(text1,text2,0,0,dp);
    
    }
    public int helper(String text1, String text2,int index1,int index2,int[][] dp)
    {
        if(index1>=text1.length() || index2>=text2.length()) return 0;
        int take=0;
        if(dp[index1][index2]!=-1) return dp[index1][index2];
        if(text1.charAt(index1)==text2.charAt(index2)) 
        {
             take=1+helper(text1,text2,index1+1,index2+1,dp);
        }
        //skip
        int skip1 =helper(text1,text2,index1+1,index2,dp);
        int skip2 =helper(text1,text2,index1,index2+1,dp);
        return dp[index1][index2]= Math.max(take,Math.max(skip1,skip2));
    }
}