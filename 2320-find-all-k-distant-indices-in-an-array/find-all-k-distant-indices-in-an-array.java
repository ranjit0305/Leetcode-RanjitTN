class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) 
    {
        List<Integer> res=new ArrayList<>();
        List<Integer> index=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==key)
            {
                index.add(i);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<index.size();j++)
            {
                if(!res.contains(i) && Math.abs(i-index.get(j))<=k)
                {
                    res.add(i);
                    break;
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}