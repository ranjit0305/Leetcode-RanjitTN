
class Solution {
    public int minDistance(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();

        int[][] dp = new int[l1][l2];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return helper(word1, word2, 0, 0,dp);
    }

    public int helper(String word1, String word2, int index1, int index2,int[][] dp) {

        if (index1 == word1.length()) {
            return word2.length() - index2;
        }

        if (index2 == word2.length()) {
            return word1.length() - index1;
        }

        if(dp[index1][index2]!=-1)
        {
            return dp[index1][index2];
        }

        if (word1.charAt(index1) == word2.charAt(index2)) {
            return dp[index1][index2]=helper(word1, word2, index1 + 1, index2 + 1,dp);
        }

        int insert = 1 + helper(word1, word2, index1, index2 + 1,dp);

        int delete = 1 + helper(word1, word2, index1 + 1, index2,dp);

        int rep = 1 + helper(word1, word2, index1 + 1, index2 + 1,dp);

        return dp[index1][index2]=Math.min(insert, Math.min(delete, rep));
    }
}
