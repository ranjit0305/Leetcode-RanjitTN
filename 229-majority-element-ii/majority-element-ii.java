class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        List<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int cnt=1;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    cnt++;
                }
            }
            if(cnt>(nums.length/3)&& !arr.contains(nums[i]))
            {
                arr.add(nums[i]);
            }
        }
        return arr;
    }
}