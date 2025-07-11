class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]-nums[i]==k)
                {
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    if(!res.contains(temp))
                    {
                        res.add(temp);
                    }
                }
            }
        }
        return res.size();
    }
}