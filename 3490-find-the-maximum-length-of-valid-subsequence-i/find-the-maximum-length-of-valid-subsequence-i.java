class Solution {
    public int maximumLength(int[] nums) 
    {
        int res=0;
        int[][] path={{0,0},{0,1},{1,0},{1,1}};
        for(int[] p:path)
        {
            int cnt=0;
            for(int num:nums)
            {
                if(num%2==p[cnt%2])
                {
                    cnt++;
                }
            }
            res=Math.max(res,cnt);
        }    
        return res;
    }
}