class Solution {
    public int maxFrequencyElements(int[] nums) 
    {
        int max=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }    
        for(int k:map.keySet())
        {
            if(map.get(k)>max)
            {
                max=map.get(k);
            }
        }
        int cnt=0;
        for(int k:map.keySet())
        {
            if(map.get(k)==max)
            {
                cnt=cnt+max;
            }
        }
        return cnt;
    }
}