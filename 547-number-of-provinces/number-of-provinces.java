class Solution {
    void dfs(int[][] isConnected, int[] vis, int i) {
        if (vis[i] != 0) return;
        vis[i] = 1;
        int n = vis.length;
        for (int j = 0; j < n; j++) {
            if (vis[j] == 0 && (isConnected[i][j] != 0 || isConnected[j][i] != 0)) dfs(isConnected, vis, j);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int ans = 0;
        int[] vis = new int[n];
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                ans++;
                dfs(isConnected, vis, i);
            }
        }
        return ans;
    }
}