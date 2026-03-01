class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int i=0;
        int total=0;
        int cnt=0;
        while(i<nums.length)
        {
            total+=nums[i];
            if(map.containsKey(total-k))
            {
                cnt=cnt+map.get(total-k);
            }
                map.put(total,map.getOrDefault(total,0)+1);
            i++;
        }
        return cnt;
    }
}