class Solution {
    public int binaryGap(int n) 
    {
        int max_dist=0;
        String bin=Integer.toBinaryString(n);
        for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i)=='1')
            {
                int start=0;
                for(int j=i+1;j<bin.length();j++)
                {
                    start++;
                    if(bin.charAt(j)=='1')
                    {
                        max_dist=Math.max(start,max_dist);
                        break;
                    }
                }
            }
        }    
        return max_dist;
    }
}