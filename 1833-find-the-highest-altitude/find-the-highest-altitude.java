class Solution {
    public int largestAltitude(int[] gain)
    {
        int max=0;
        int tempsum=0;
        for(int i=0;i<gain.length;i++)
        {
            tempsum+=gain[i];
            if(tempsum>max)
            {
                max=tempsum;
            }
        }    
        return max;
    }
}