import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) 
    {
        int cnt = 0;
        int[] expected = heights.clone(); // Clone the original array
        Arrays.sort(expected); // Sort the cloned array
        for(int i = 0; i < heights.length; i++)
        {
            if(heights[i] != expected[i])
            {
                cnt = cnt + 1;
            }
        }    
        return cnt;
    }
}
