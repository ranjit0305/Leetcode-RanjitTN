class Solution {

    int[][] best;

    public boolean findSafeWalk(List<List<Integer>> grid, int health) {

        int m = grid.size();
        int n = grid.get(0).size();

        best = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(best[i], -1);
        }

        return dfs(0, 0, grid, health);
    }

    boolean dfs(int r, int c, List<List<Integer>> grid, int health) {

        int m = grid.size();
        int n = grid.get(0).size();

        if (r < 0 || r >= m || c < 0 || c >= n)
            return false;

        health -= grid.get(r).get(c);

        if (health <= 0)
            return false;

        if (r == m - 1 && c == n - 1)
            return true;

        // Already reached this cell with equal or more health
        if (best[r][c] >= health)
            return false;

        best[r][c] = health;

        return dfs(r + 1, c, grid, health)
                || dfs(r - 1, c, grid, health)
                || dfs(r, c + 1, grid, health)
                || dfs(r, c - 1, grid, health);
    }
}