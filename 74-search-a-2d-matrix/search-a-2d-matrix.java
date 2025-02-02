class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = 0;

        // Find the correct row
        while (row < matrix.length && matrix[row][0] < target) {
            row++;
        }

        // If row is within bounds and matrix[row][0] == target, return true immediately
        if (row < matrix.length && matrix[row][0] == target) {
            return true;
        }

        if (row > 0) row--; // ✅ Only decrement row if it's not at the first row

        // Search in the selected row
        while (col < matrix[row].length && matrix[row][col] < target) {
            col++;
        }

        if (col < matrix[row].length && matrix[row][col] == target) { // ✅ Prevents out-of-bounds error
            return true;
        }

        return false;
    }
}
