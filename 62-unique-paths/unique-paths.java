
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        return helper(arr, m - 1, n - 1);
    }

    public int helper(int arr[][],int m,int n)
    {
        if(m<0 || n<0) return 0;

        if(m==0 && n==0) 
        {
            arr[m][n]=1;
            return 1;
        }

        if(arr[m][n]>0) return arr[m][n];

        arr[m][n]=helper(arr,m,n-1)+helper(arr,m-1,n);

        return arr[m][n];
    }
}
