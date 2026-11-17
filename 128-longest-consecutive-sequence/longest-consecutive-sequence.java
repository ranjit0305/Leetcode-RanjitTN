class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest=1;
        if(numSet.size()==0)
        {
            return 0;
        }
        for(int num:numSet)
        {
            if(!numSet.contains(num-1))
            {
                int temp=1;
                while(numSet.contains(num+temp))
                {
                    temp++;
                }
                longest=Math.max(longest,temp);
            }
        }    
        return longest;    
    }
}