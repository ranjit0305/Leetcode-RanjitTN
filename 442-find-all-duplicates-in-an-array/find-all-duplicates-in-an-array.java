class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Integer k:map.keySet())
        {
            int tempcnt=map.get(k);
            if(tempcnt>=2)
            {
                res.add(k);
            }
        }
        return res;
    }
}