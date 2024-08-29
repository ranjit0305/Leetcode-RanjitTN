class Solution {
    public int removeStones(int[][] stones) {
        int cnt=0;
        int n=stones.length;
        boolean[] visited=new boolean[n];
        for (int i=0;i<stones.length;i++)
        {
            if(!visited[i])
            {
                cnt=cnt+dfs(stones,visited,i)-1;
            }
        }
        return cnt;
    }
    private int dfs(int[][] stones, boolean[] visited, int i)
     {
        visited[i] = true;
        int count = 1;
        for (int j = 0; j < stones.length; j++) {
            if (!visited[j] && (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1])) {
                count += dfs(stones, visited, j);
            }
        }
        return count;
    }
}