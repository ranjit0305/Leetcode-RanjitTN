class Solution {
    public int[] xorQueries(int[] arr, int[][] queries)
    {
        int[] answer = new int[queries.length];
        for(int i = 0; i < queries.length; i++)
        {
            int e1 = queries[i][0];
            int e2 = queries[i][1];
            int ans = arr[e1];
            for(int j = e1 + 1; j <= e2; j++) {
                ans ^= arr[j];
            }
            answer[i] = ans;
        }
        return answer;
    }
}
