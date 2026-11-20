class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        int res=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int lastIndex=-2;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(map.containsKey(sum-target) && map.get(sum-target)>=lastIndex)
            {
                res++;
                lastIndex=i;
            }
            map.put(sum,i);
        }
        return res;
        
    }
}