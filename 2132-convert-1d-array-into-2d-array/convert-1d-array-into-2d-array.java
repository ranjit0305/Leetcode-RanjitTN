class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) 
    {
        // Check if it's possible to construct the 2D array
        if (original.length != m * n) {
            return new int[0][0];  // Return an empty array if it's not possible
        }
        
        int[][] arr = new int[m][n];
        
        // First loop to fill the first row
        for(int i = 0; i < n; i++)
        {
            arr[0][i] = original[i];
        }    
        
        // Second loop to fill the second row (if m > 1)
        if (m > 1) {
            for(int k = 0; k < n; k++)
            {
                arr[1][k] = original[n + k];
            }
        }

        // Additional loops if there are more rows
        for (int i = 2; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = original[i * n + j];
            }
        }
        
        return arr;
    }
}
