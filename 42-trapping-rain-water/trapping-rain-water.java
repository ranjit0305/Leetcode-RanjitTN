class Solution {
    public int trap(int[] height) {
        int left=0;
        int leftmax=0;
        int rightmax=0;
        int right=height.length-1;
        int cnt=0;
        while(left<right)
        {
            if(height[left]<=height[right])
            {
                if(height[left]<leftmax)
                {
                    cnt=cnt+(leftmax-height[left]);
                }
                else
                {
                    leftmax=Math.max(height[left],leftmax);
                }
                left=left+1;
            }
            else
            {
                if(height[right]<rightmax)
                {
                    cnt=cnt+(rightmax-height[right]);
                }
                else
                {
                    rightmax=Math.max(height[right],rightmax);
                }
                right=right-1;
            }
        }
        return cnt;
    }
}