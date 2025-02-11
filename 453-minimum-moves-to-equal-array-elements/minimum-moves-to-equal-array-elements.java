class Solution {
    public int minMoves(int[] nums) {
        int cnt=0;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.min(max,nums[i]);
        }
        for(int j=0;j<nums.length;j++)
        {
            cnt=cnt+(nums[j]-max);
        }
        return cnt;
    }
}