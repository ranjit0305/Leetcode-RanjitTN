class Solution {
    public int minDistance(String word1, String word2) 
    {
        int l1 = word1.length();
        int l2 = word2.length();

        int[][] dp = new int[l1][l2];

        for(int i = 0; i < dp.length; i++)
        {
            Arrays.fill(dp[i], -1);
        }

        return find(word1, word2, l1-1, l2-1, dp);
    }

    public int find(String word1, String word2, int l1, int l2, int[][] dp)
    {
        if(l1 < 0) return l2 + 1;
        if(l2 < 0) return l1 + 1;

        if(dp[l1][l2] != -1) return dp[l1][l2];

        if(word1.charAt(l1) == word2.charAt(l2))
        {
            return dp[l1][l2] = find(word1, word2, l1-1, l2-1, dp);
        }
        else
        {
            int ins = 1 + find(word1, word2, l1, l2-1, dp);
            int del = 1 + find(word1, word2, l1-1, l2, dp);
            int rep = 1 + find(word1, word2, l1-1, l2-1, dp); 

            return dp[l1][l2] = Math.min(rep, Math.min(ins, del));
        }
    }
}