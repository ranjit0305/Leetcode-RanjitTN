class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] col = new int[graph.length];
        Arrays.fill(col, -1);

        for (int i = 0; i < col.length; i++) {
            if (col[i] == -1) {
                if (!dfs(i, 0, col, graph)) return false;
            }
        }

        return true;
    }

    public boolean dfs(int i, int color, int[] col, int[][] graph) {
        col[i] = color;
        for (int neighbor : graph[i]) {
            if (col[neighbor] == -1) {
                if (!dfs(neighbor, 1 - color, col, graph)) return false;
            } else if (col[neighbor] == color) {
                return false;
            }
        }
        return true;
    }
}
