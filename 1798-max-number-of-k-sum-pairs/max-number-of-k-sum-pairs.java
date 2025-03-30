class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int cnt=0;
        while(i<j)
        {
            int temp=nums[i]+nums[j];
            if(temp==k)
            {
                i++;
                j--;
                cnt++;
            }
            else if(temp>k)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return cnt;
    }
}