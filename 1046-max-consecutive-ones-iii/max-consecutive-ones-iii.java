class Solution {
    public int longestOnes(int[] arr, int k) {
        int l=0,r=0,c=0,ans=0,n=arr.length;
        for(r=0;r<n;r++)
        {
            if(arr[r]==0)
            {
                c+=1;
            }
            while(c>k)
            {
                if(arr[l]==0)
                {
                    c-=1;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}