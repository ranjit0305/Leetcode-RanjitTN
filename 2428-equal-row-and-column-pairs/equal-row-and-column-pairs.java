class Solution {
    public int equalPairs(int[][] grid) {
        int cnt = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++) {          
            for (int j = 0; j < n; j++) {    
                int check = 0;
                for (int k = 0; k < n; k++) {
                    if (grid[i][k] == grid[k][j]) {
                        check++;
                    }
                }
                if (check == n) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
